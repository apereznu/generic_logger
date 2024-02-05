package io.nu.kang.state.process.reports.service.impl;

import io.nu.kang.state.process.reports.models.CuadraturaStateData;
import io.nu.kang.state.process.reports.models.UserActivityData;
import io.nu.kang.state.process.reports.models.UserActivityRequest;
import io.nu.kang.state.process.reports.repository.UserActivityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserActivityImpl implements UserActivity{

    private final UserActivityRepository userActivityRepository;

    public UserActivityImpl(UserActivityRepository userActivityRepository) {
        this.userActivityRepository = userActivityRepository;
    }


    @Override
    public List<UserActivityData> getStateByxFlowId(String xFlowId) {
        return userActivityRepository.findByxFlowId(xFlowId);
    }

    @Override
    public UserActivityData saveUserActivityData(UserActivityRequest request) {
        UserActivityData userActivityData= new UserActivityData();

        userActivityData.setUserId(request.getUserId());
        userActivityData.setIP(request.getIP());
        userActivityData.setAction(request.getAction());
        userActivityData.setModule(request.getModule());
        userActivityData.setMethod(request.getMethod());
        userActivityData.setTraceId(request.getTraceId());
        userActivityData.setXFlowId(request.getXflowId());
        userActivityData.setState(request.getState());
        userActivityData.setCreatedAt(LocalDateTime.now());

        return userActivityRepository.save(userActivityData);
    }
}

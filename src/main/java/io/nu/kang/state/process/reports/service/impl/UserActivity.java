package io.nu.kang.state.process.reports.service.impl;

import io.nu.kang.state.process.reports.models.CuadraturaStateData;
import io.nu.kang.state.process.reports.models.UserActivityData;
import io.nu.kang.state.process.reports.models.UserActivityRequest;

import java.util.List;

public interface UserActivity {
    public List<UserActivityData> getStateByxFlowId(String xFlowId);
    public UserActivityData saveUserActivityData(UserActivityRequest request);
}

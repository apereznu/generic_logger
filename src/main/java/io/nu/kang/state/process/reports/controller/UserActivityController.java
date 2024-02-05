package io.nu.kang.state.process.reports.controller;

import io.nu.kang.state.process.reports.models.UserActivityData;
import io.nu.kang.state.process.reports.models.UserActivityRequest;
import io.nu.kang.state.process.reports.service.impl.UserActivity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/kang/user-activity/log")
public class UserActivityController {

    private final UserActivity userActivity;


    public UserActivityController(UserActivity userActivity) {
        this.userActivity = userActivity;
    }

    @GetMapping("/{xFlowId}")
    public List<UserActivityData> findUserActivityByXflowId(@PathVariable String xFlowId)
    {
        return userActivity.getStateByxFlowId(xFlowId);
    }

    @PostMapping("/")
    public UserActivityData savaUserActivity(@RequestBody UserActivityRequest request){
        return userActivity.saveUserActivityData(request);
    }
}

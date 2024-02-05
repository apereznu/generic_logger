package io.nu.kang.state.process.reports.models;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
public class UserActivityRequest {
    String userId;
    String state;
    String action;
    String traceId;
    String xflowId;
    String module;
    String method;
    String IP;
}

package io.nu.kang.state.process.reports.models;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "log.userActivity")
public class UserActivityData {
    String userId;
    String state;
    @CreatedDate
    private LocalDateTime createdAt;
    String action;
    String traceId;
    String xFlowId;
    String module;
    String method;
    String IP;

}

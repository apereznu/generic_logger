package io.nu.kang.state.process.reports.models;

import lombok.Data;

@Data
public class StateRequest {
private String state;
private String xFlowId;
private String statusCode;
private String result;

}

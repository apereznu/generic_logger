package io.nu.kang.state.process.reports.service.impl;

import io.nu.kang.state.process.reports.models.CuadraturaStateData;
import io.nu.kang.state.process.reports.models.StateRequest;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CuadraturaState {

    List<CuadraturaStateData> getStateByxFlowId(String xFlowId);

    public CuadraturaStateData saveState(StateRequest request);

}

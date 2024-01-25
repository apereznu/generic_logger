package io.nu.kang.state.process.reports.service.impl;

import io.nu.kang.state.process.reports.models.CuadraturaStateData;
import io.nu.kang.state.process.reports.models.StateRequest;
import io.nu.kang.state.process.reports.repository.CuadraturaStateRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CuadraturaStateImpl implements CuadraturaState{

    private final CuadraturaStateRepository cuadraturaStateRepository;

    public CuadraturaStateImpl(CuadraturaStateRepository cuadraturaStateRepository) {
        this.cuadraturaStateRepository = cuadraturaStateRepository;
    }

    @Override
    public List<CuadraturaStateData> getStateByProcessId(String xFlowId) {
        return cuadraturaStateRepository.findByxFlowId(xFlowId);
    }

    @Override
    public CuadraturaStateData saveState(StateRequest request) {
        CuadraturaStateData item = new CuadraturaStateData();
        item.setState(request.getState());
        item.setXFlowId(request.getXFlowId());
        item.setTimestamp(LocalDateTime.now());
        item.setResult(request.getResult());
        item.setStatusCode(request.getStatusCode());
        return cuadraturaStateRepository.save(item);
    }
}

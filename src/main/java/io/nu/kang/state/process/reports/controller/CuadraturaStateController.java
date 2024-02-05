package io.nu.kang.state.process.reports.controller;

import io.nu.kang.state.process.reports.models.CuadraturaStateData;
import io.nu.kang.state.process.reports.models.StateRequest;
import io.nu.kang.state.process.reports.service.impl.CuadraturaState;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/kang/cuadratura-process/log")
public class CuadraturaStateController {
    private final CuadraturaState cuadraturaState;

    public CuadraturaStateController(CuadraturaState cuadraturaState) {
        this.cuadraturaState = cuadraturaState;
    }

    @GetMapping("/{xFlowId}")
    public List<CuadraturaStateData> getStateByProcessId(@PathVariable String  xFlowId){
        return cuadraturaState.getStateByxFlowId(xFlowId);

    }

    @PostMapping("/")
    public CuadraturaStateData createState(@RequestBody StateRequest request){
        return cuadraturaState.saveState(request);
    }
}

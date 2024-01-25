package io.nu.kang.state.process.reports.repository;

import io.nu.kang.state.process.reports.models.CuadraturaStateData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CuadraturaStateRepository extends MongoRepository<CuadraturaStateData, Long> {
    public List<CuadraturaStateData> findByxFlowId(String xFlowId);
}
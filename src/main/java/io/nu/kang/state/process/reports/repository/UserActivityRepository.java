package io.nu.kang.state.process.reports.repository;

import io.nu.kang.state.process.reports.models.UserActivityData;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserActivityRepository extends MongoRepository<UserActivityData,Long> {
    public List<UserActivityData> findByxFlowId(String xFlowId);
}

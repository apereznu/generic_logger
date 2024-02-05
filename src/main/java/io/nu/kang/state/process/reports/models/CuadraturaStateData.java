package io.nu.kang.state.process.reports.models;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "log.cuadratura")
public class CuadraturaStateData {

    @NotBlank
    private String state;
    @NotBlank
    private String xFlowId;
    @CreatedDate
    private LocalDateTime timestamp;
    private String result;
    private String statusCode;


}

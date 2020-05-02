package com.qayam.departmentservice.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class DepartmentResponse {
    private LocalDate date;
    @JsonProperty("DepartmentDetail")
    private List<DepartmentDetail> departmentDetailList;
}

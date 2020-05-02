package com.qayam.departmentservice.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentDetail {
    private int deptId;
    private String deptName;
    private int managerId;
    private int locationId;
}

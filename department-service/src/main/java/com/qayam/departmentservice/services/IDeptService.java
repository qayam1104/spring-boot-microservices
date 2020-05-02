package com.qayam.departmentservice.services;

import com.qayam.departmentservice.domain.DepartmentResponse;

import java.util.List;

public interface IDeptService {

    DepartmentResponse getDeptResponse(String deptId);
}

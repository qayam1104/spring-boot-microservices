package com.qayam.departmentservice.web;

import com.qayam.departmentservice.domain.DepartmentDetail;
import com.qayam.departmentservice.domain.DepartmentResponse;
import com.qayam.departmentservice.services.DeptService;
import com.qayam.departmentservice.services.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

@Autowired
private IDeptService deptService;
    @RequestMapping("/{deptId}")
    public DepartmentResponse getDepartmentDetail(@PathVariable("deptId") String deptId) {

        return deptService.getDeptResponse(deptId);
    }
}

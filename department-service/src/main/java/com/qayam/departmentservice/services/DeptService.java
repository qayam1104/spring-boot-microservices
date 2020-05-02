package com.qayam.departmentservice.services;

import com.qayam.departmentservice.dao.DepartmentDao;
import com.qayam.departmentservice.dao.IDepartmentDao;
import com.qayam.departmentservice.domain.DepartmentDetail;
import com.qayam.departmentservice.domain.DepartmentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DeptService implements IDeptService {

    private IDepartmentDao departmentDao;

    @Autowired
    public DeptService(final DepartmentDao departmentDao){
        this.departmentDao = departmentDao;
    }

    @Override
    public DepartmentResponse getDeptResponse(String deptId) {

        int departmentId = Integer.valueOf(deptId);
        List<DepartmentDetail> departmentRawData = departmentDao.getDepartmentDetailData(departmentId);

        return DepartmentResponse.builder()
                .date(LocalDate.now())
                .departmentDetailList(departmentRawData)
                .build();
    }
}

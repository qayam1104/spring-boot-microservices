package com.qayam.departmentservice.dao;

import com.qayam.departmentservice.domain.DepartmentDetail;
import com.qayam.departmentservice.domain.DepartmentRawData;

import java.util.List;

public interface IDepartmentDao {

    List<DepartmentDetail> getDepartmentDetailData(int deptid);
}

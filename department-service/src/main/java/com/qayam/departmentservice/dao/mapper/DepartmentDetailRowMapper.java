package com.qayam.departmentservice.dao.mapper;

import com.qayam.departmentservice.dao.enums.DepartmentColumns;
import com.qayam.departmentservice.domain.DepartmentDetail;
import com.qayam.departmentservice.domain.DepartmentRawData;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentDetailRowMapper implements RowMapper<DepartmentDetail> {

    @Override
    public DepartmentDetail mapRow(ResultSet resultSet, int i) throws SQLException {
        return DepartmentDetail.builder()
                .deptId(resultSet.getInt(DepartmentColumns.DEPARTMENT_ID.getSQLColumnName()))
                .deptName(resultSet.getString(DepartmentColumns.DEPARTMENT_NAME.getSQLColumnName()))
                .managerId(resultSet.getInt(DepartmentColumns.MANAGER_ID.getSQLColumnName()))
                .locationId(resultSet.getInt(DepartmentColumns.LOCATION_ID.getSQLColumnName()))
                .build();
    }
}

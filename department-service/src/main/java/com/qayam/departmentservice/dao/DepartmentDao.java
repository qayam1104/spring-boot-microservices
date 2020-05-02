package com.qayam.departmentservice.dao;

import com.qayam.departmentservice.dao.enums.DepartmentColumns;
import com.qayam.departmentservice.dao.mapper.DepartmentDetailRowMapper;
import com.qayam.departmentservice.domain.DepartmentDetail;
import com.qayam.departmentservice.domain.DepartmentRawData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class DepartmentDao implements IDepartmentDao{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private String sql = getDeptSql();

    @Autowired
    public DepartmentDao(final NamedParameterJdbcTemplate namedParameterJdbcTemplate){
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<DepartmentDetail> getDepartmentDetailData(int deptid) {
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue(DepartmentColumns.DEPARTMENT_ID.getSQLColumnName(), deptid);

        return namedParameterJdbcTemplate.query(sql,mapSqlParameterSource,new DepartmentDetailRowMapper());
    }

    private String getDeptSql() {
        return "Select * from "+DepartmentColumns.SQL_TABLE_NAME+
                " Where "+DepartmentColumns.DEPARTMENT_ID.getSQLColumnName() + "=:" +
                DepartmentColumns.DEPARTMENT_ID.getSQLColumnName();
    }
}

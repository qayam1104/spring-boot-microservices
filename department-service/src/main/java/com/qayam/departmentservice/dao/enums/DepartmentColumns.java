package com.qayam.departmentservice.dao.enums;

public enum DepartmentColumns {
    DEPARTMENT_ID("DEPARTMENT_ID"),
    DEPARTMENT_NAME("DEPARTMENT_NAME"),
    MANAGER_ID("MANAGER_ID"),
    LOCATION_ID("LOCATION_ID");

    private final String dbColumn;
    public static final String SQL_TABLE_NAME="Departments";

    DepartmentColumns(String dbColumns){
        this.dbColumn = dbColumns;
    }

    public String getSQLColumnName(){
        return this.dbColumn;
    }

}

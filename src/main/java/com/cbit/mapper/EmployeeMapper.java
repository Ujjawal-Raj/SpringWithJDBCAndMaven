package com.cbit.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cbit.bean.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet res, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpId(res.getInt("empId"));
		emp.setEmpName(res.getString("empName"));
		emp.setEmpAddress(res.getString("empAddress"));
		emp.setEmpSalary(res.getDouble("empSalary"));
		emp.setEmpDept(res.getString("empDept"));
		return emp;
	}

}

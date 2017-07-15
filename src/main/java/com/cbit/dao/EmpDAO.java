package com.cbit.dao;

import java.util.List;
import java.util.Map;

import com.cbit.bean.Employee;

public interface EmpDAO {
	public void createEmp();
	public int insertEmp(Employee e);
	public List<Map<String, Object>> selectEmp();
	public int updateEmp(double empSalary, int empId);
}

package com.cbit.bo;

import java.util.List;
import java.util.Map;

import com.cbit.bean.Employee;
import com.cbit.dao.EmpDAO;

public class DemoBeanImpl implements DemoBean {
	private EmpDAO empDao;
	
	public void setEmpDao(EmpDAO empDao) {
		this.empDao = empDao;
	}
	
	@Override
	public void createEmp() {
		empDao.createEmp();
		System.out.println("Table successfully created.");
	}

	@Override
	public int insertEmp(Employee e) {
		int i = empDao.insertEmp(e);
		return i;
	}

	@Override
	public List<Map<String, Object>> selectEmp() {
		List<Map<String, Object>> list = empDao.selectEmp();
		return list;
	}

	@Override
	public int updateEmp(double empSalary, int empId) {
		int i = empDao.updateEmp(empSalary, empId);
		return i;
	}

}

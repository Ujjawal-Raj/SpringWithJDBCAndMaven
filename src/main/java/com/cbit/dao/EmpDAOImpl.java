package com.cbit.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cbit.bean.Employee;

public class EmpDAOImpl implements EmpDAO {
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void createEmp() {
		jt.execute("create table EmployeeTab (EmpId int(5) primary key, EmpName varchar(30), EmpAddress varchar(45), EmpSalary double, EmpDept varchar(25))");
	}

	@Override
	public int insertEmp(Employee e) {
		int id = e.getEmpId();
		String name = e.getEmpName();
		String address = e.getEmpAddress();
		double salary = e.getEmpSalary();
		String dept = e.getEmpDept();
		Object[] param = { id, name, address, salary, dept };
		int i = jt.update("insert into EmployeeTab values(?,?,?,?,?)", param);
		return i;
	}

	@Override
	public List<Map<String, Object>> selectEmp() {
		List<Map<String, Object>> list = jt.queryForList("select * from EmployeeTab");
		return list;
	}

	@Override
	public int updateEmp(double empSalary, int empId) {
		Object[] param = { empSalary, empId };
		int i = jt.update(
				"update EmployeeTab set empSalary = ? where empId = ?", param);
		return i;
	}

}

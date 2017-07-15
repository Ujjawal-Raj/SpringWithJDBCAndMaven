package com.cbit.client;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbit.bo.DemoBeanImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		DemoBeanImpl dbi = (DemoBeanImpl) context.getBean("demoBean");
		/*
		 * Employee emp = new Employee(); emp.setEmpId(102);
		 * emp.setEmpName("Shobhit Raj"); emp.setEmpAddress("Warisaliganj");
		 * emp.setEmpSalary(28000); emp.setEmpDept("College Department");
		 */
		// dbi.createEmp();
		/*
		 * int i = dbi.insertEmp(emp); System.out.println(i+" Record inserted");
		 */
		/*
		 * int j = dbi.updateEmp(26000, 101);
		 * System.out.println(j+" Record successfully updated.");
		 */
		/*
		 * List<Employee> list = dbi.selectEmp(); Iterator<Employee> itr =
		 * list.iterator(); while(itr.hasNext()){
		 * System.out.println(itr.next()); }
		 */
		List<Map<String, Object>> list = dbi.selectEmp();
		Iterator<Map<String, Object>> itr = list.iterator();
		while (itr.hasNext()) {
			Map<String, Object> map = itr.next();
			Set<Entry<String, Object>> set = map.entrySet();
			Iterator<Entry<String, Object>> itr1 = set.iterator();
			while (itr1.hasNext()) {
				Entry<String, Object> entry = itr1.next();
				System.out.print(entry.getValue()+" ");
			}
			System.out.println();

		}

	}

}

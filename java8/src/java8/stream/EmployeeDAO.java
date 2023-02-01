package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	private List<Employee> employees = new ArrayList<>();

	public List<Employee> getEmployees() {
		employees.add(new Employee(1, "Manoj", 1200000L));
		employees.add(new Employee(2, "Kumar", 1100000L));
		employees.add(new Employee(3, "skjfn", 100000L));
		employees.add(new Employee(4, "fsdfd", 1000000L));
		employees.add(new Employee(5, "aseas", 0L));
		return employees;
	}

}

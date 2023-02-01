package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.stream.Employee;
import java8.stream.EmployeeDAO;

public class SortDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Manoj");
		list.add("Kumar");
		list.add("Pentela");

		EmployeeDAO employeeDAO = new EmployeeDAO();

		// sort employees based on their salary
		employeeDAO.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary))
				.forEach(System.out::println);

		list.stream().sorted(Collections.reverseOrder()).forEach(ele -> System.out.println(ele));

	}

}

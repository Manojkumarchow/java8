package java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import java8.util.*;

public class TaxCalculator {

	private List<String> getTaxableEmployeeNames(EmployeeDAO employeeDAO) {
		return employeeDAO.getEmployees().stream()
				.filter(employee -> employee.getSalary() > ApplicationConstants.TAXABLE_AMOUNT).distinct()
				.map(employee -> employee.getName()).collect(Collectors.toList());
	}

	private List<Employee> getTaxableEmployees(EmployeeDAO employeeDAO) {
		return employeeDAO.getEmployees().stream()
				.filter(employee -> employee.getSalary() > ApplicationConstants.TAXABLE_AMOUNT).distinct()
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAO();

		System.out.println("Taxable Employees");

		System.out.println(new TaxCalculator().getTaxableEmployees(employeeDAO));

		System.out.println("Taxable Employee Names");

		System.out.println(new TaxCalculator().getTaxableEmployeeNames(employeeDAO));

	}

}

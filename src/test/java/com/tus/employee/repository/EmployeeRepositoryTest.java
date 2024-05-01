package com.tus.employee.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;

import com.tus.employee.entity.Employee;

public class EmployeeRepositoryTest {

	private Employee emp;
	private Employee emp1;
	private Employee emp2;
	private Employee emp3;
	private Employee emp4;
	private List<Employee> empList;

	@Mock
	private EmployeeRepository repository;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		emp = new Employee(1L, 1L, 1L,"Shannon", 30, "Test");
		empList= new ArrayList<Employee>();
		emp1 = new Employee(1L, 1L, 1L,"Alan", 35, "Test");
		emp2= new Employee(2L, 2L, 2L,"Pearson", 33, "Test");
		emp3 = new Employee(3L, 3L, 3L,"Ana", 33, "Test");
		emp4= new Employee(4L, 4L, 4L,"John", 39, "Test");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
	}
	
	
	@Test
	 void testAddEmployee() {
        Employee employee = repository.add(emp);
        Assert.notNull(emp, "Employee is invalid.");
        Assert.isTrue(emp.getId() == 1L, "Employee id is invalid.");
    }
	
	@Test
    void testFindAll() {
        List<Employee> employees = empList;
        Assert.isTrue(employees.size() == 1, "Employees size is invalid.");
        Assert.isTrue(employees.get(0).getId() == 1L, "Employee id is invalid.");
    }
	
	@Test
    void testFindById() {
        Employee employee = empList.get(0);
        Assert.notNull(employee, "Employee not found.");
        Assert.isTrue(employee.getId() == 1L, "Employee id is invalid.");
    }
}

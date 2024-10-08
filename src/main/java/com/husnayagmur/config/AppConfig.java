package com.husnayagmur.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.husnayagmur.model.Employee;

@Configuration
public class AppConfig {

	@Bean
	public List<Employee> employeList(){
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee("1","Husna","Yagmur"));
		employeeList.add(new Employee("2","Samed","Hacibekiroglu"));
		employeeList.add(new Employee("3","Esma","Demir"));
		employeeList.add(new Employee("4","Sema","Oz"));
		employeeList.add(new Employee("5","Melike","Dere"));
		employeeList.add(new Employee("6","Husna","kar"));

		return employeeList;
	}
}

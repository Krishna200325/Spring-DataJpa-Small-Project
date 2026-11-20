package com.nit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EntityScan (basePackages =  "com.nit")

public class EmplyoeedetailsApplication {

	public static void main(String[] args) {
		ApplicationContext  context = SpringApplication.run(EmplyoeedetailsApplication.class, args);

		EmplyoeeService service = context.getBean(EmplyoeeService.class);

		// Scanner sc =new Scanner(System.in);

		// List<EmplyoeeEntity> emp=new ArrayList<EmplyoeeEntity>();
		 
		// System.out.println("Insert the emplyoee");
		// for(int i =1;i<=3;i++){

		// EmplyoeeEntity emplyoeeEntity = new EmplyoeeEntity();
	
		// System.out.println("Enter the emplyoee name");
		// String name = sc.nextLine();
		// emplyoeeEntity.setName(name);

		// System.out.println("Enter the age");
		// int age = sc.nextInt();
		// emplyoeeEntity.setAge(age);

		// System.out.println("Enter the salary");
		// int salary = sc.nextInt();
		// emplyoeeEntity.setSalary(salary);
		
		// System.out.println("Enter the add");
		// sc.nextLine();
		// String add =sc.nextLine();
		// emplyoeeEntity.setAddress(add);

		// System.out.println("Enter the Designation");
		// String desgination = sc.nextLine();
		// emplyoeeEntity.setDesignation(desgination);
		
          
		// emp.add(emplyoeeEntity);
		

		// }

                // service.insertEmp(emp);
		// System.out.println("Insert succesffully");
		

		// service.getEmplyoeeAge(24);

		//service.getAgeBetween(23,24);
            
		service.findDesignationBy("IT", "Manager");
	}

}

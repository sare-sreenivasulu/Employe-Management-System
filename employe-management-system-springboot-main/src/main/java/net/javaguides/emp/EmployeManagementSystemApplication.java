package net.javaguides.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.emp.entity.Employe;
import net.javaguides.emp.repository.EmployeRepository;

@SpringBootApplication
public class EmployeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeManagementSystemApplication.class, args);
	}

	@Autowired
	private EmployeRepository employeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
	
		
	}

}

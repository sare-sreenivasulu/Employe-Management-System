package net.javaguides.emp.service;

import java.util.List;

import net.javaguides.emp.entity.Employe;

public interface EmployeService {
	List<Employe> getAllEmployes1();
	
	Employe saveEmploye(Employe employe);
	
	Employe getEmployeById(Long id);
	
	Employe updateEmploye(Employe employe);
	
	void deleteEmployeById(Long id);

	List<Employe> getAllEmployes();

	
}

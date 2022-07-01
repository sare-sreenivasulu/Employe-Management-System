package net.javaguides.emp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.emp.entity.Employe;
import net.javaguides.emp.repository.EmployeRepository;
import net.javaguides.emp.service.EmployeService;

@Service
public class EmployetServiceImpl implements EmployeService{

	private EmployeRepository employeRepository;
	
	public EmployetServiceImpl(EmployeRepository employeRepository) {
		super();
		this.employeRepository = employeRepository;
	}

	@Override
	public List<Employe> getAllEmployes() {
		return employeRepository.findAll();
	}

	@Override
	public Employe saveEmploye(Employe employe) {
		return employeRepository.save(employe);
	}

	@Override
	public Employe getEmployeById(Long id) {
		return employeRepository.findById(id).get();
	}

	@Override
	public Employe updateEmploye(Employe employe) {
		return employeRepository.save(employe);
	}

	@Override
	public void deleteEmployeById(Long id) {
		employeRepository.deleteById(id);	
	}

	@Override
	public List<Employe> getAllEmployes1() {
		// TODO Auto-generated method stub
		return null;
	}

}

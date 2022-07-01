package net.javaguides.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.emp.entity.Employe;
import net.javaguides.emp.service.EmployeService;

@Controller
public class EmployeController {
	
	 EmployeService employeService;

	public EmployeController(EmployeService employeService) {
		super();
		this.employeService = employeService;
	}
	
	
	@GetMapping("/employes")
	public String listEmployes(Model model) {
		model.addAttribute("employes", employeService.getAllEmployes());
		return "employes";
	}
	
	@GetMapping("/employes/new")
	public String createEmployeForm(Model model) {
		
		
		Employe employe = new Employe();
		model.addAttribute("employe", employe);
		return "create_employe";
		
	}
	
	@PostMapping("/employes")
	public String saveEmploye(@ModelAttribute("employe") Employe employe) {
		employeService.saveEmploye(employe);
		return "redirect:/employes";
	}
	
	@GetMapping("/employes/edit/{id}")
	public String editeEmployetForm(@PathVariable Long id, Model model) {
		model.addAttribute("employe", employeService.getEmployeById(id));
		return "edit_employe";
	}

	@PostMapping("/employes/{id}")
	public String updateEmploye(@PathVariable Long id,
			@ModelAttribute("employe") Employe employe,
			Model model) {
		
	
		Employe existingEmploye = employeService.getEmployeById(id);
		existingEmploye.setId(id);
		existingEmploye.setFirstName(employe.getFirstName());
		existingEmploye.setLastName(employe.getLastName());
		existingEmploye.setEmail(employe.getEmail());
		
				employeService.updateEmploye(existingEmploye);
		return "redirect:/employes";		
	}
		
	@GetMapping("/employes/{id}")
	public String deleteEmploye(@PathVariable Long id) {
		employeService.deleteEmployeById(id);
		return "redirect:/employes";
	}
	
}

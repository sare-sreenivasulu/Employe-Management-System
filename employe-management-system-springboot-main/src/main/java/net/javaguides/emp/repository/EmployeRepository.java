package net.javaguides.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.emp.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long>{

}

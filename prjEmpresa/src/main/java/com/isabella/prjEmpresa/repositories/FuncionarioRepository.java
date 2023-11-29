package com.isabella.prjEmpresa.repositories;
	
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.isabella.prjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	@Query("SELECT f FROM Funcionario f WHERE LOWER(f.Funname) LIKE LOWER(CONCAT('%', :Funname, '%'))")
	List<Funcionario> findByNomeContaining(@Param("Funname") String Funname);

}
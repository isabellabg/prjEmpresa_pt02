package com.isabella.prjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class Departamento {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long Codigo;
		
		private String Name;

		public Long getCodigo() {
			return Codigo;
		}

		public void setCodigo(Long codigo) {
			Codigo = codigo;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		
		
	}
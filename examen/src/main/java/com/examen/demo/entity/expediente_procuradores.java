package com.examen.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
@Entity
@Table(name="expediente_procuradores", uniqueConstraints = {@UniqueConstraint(columnNames= {"id_expediente", "id_procurador"})})
public class expediente_procuradores implements Serializable{

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_expediente_procuradores;
	private static final long serialVersionUID = 1L;
	
	@Column (unique = true)
	private String id_expediente;
	@Column (unique = true)
	private String id_procurador;
	public Long getId_expediente_procuradores() {
		return id_expediente_procuradores;
	}
	public void setId_expediente_procuradores(Long id_expediente_procuradores) {
		this.id_expediente_procuradores = id_expediente_procuradores;
	}
	public String getId_expediente() {
		return id_expediente;
	}
	public void setId_expediente(String id_expediente) {
		this.id_expediente = id_expediente;
	}
	public String getId_procurador() {
		return id_procurador;
	}
	public void setId_procurador(String id_procurador) {
		this.id_procurador = id_procurador;
	}
	
	

}

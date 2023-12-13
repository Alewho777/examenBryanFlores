package com.examen.demo.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="procurador")
public class procurador implements Serializable{

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_procurador;
	private static final long serialVersionUID = 1L;
	
	@Column (unique = true)
	private String cedula_procurador;
	
	private String nombre_procurador;
	private String direccion_procurador;
	private String celular_procurador;
	private String telefono_procurador;
	
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_procurador")
	private List<expediente_procuradores> expediente_procuradores;


	public Long getId_procurador() {
		return id_procurador;
	}


	public void setId_procurador(Long id_procurador) {
		this.id_procurador = id_procurador;
	}


	public String getCedula_procurador() {
		return cedula_procurador;
	}


	public void setCedula_procurador(String cedula_procurador) {
		this.cedula_procurador = cedula_procurador;
	}


	public String getNombre_procurador() {
		return nombre_procurador;
	}


	public void setNombre_procurador(String nombre_procurador) {
		this.nombre_procurador = nombre_procurador;
	}


	public String getDireccion_procurador() {
		return direccion_procurador;
	}


	public void setDireccion_procurador(String direccion_procurador) {
		this.direccion_procurador = direccion_procurador;
	}


	public String getCelular_procurador() {
		return celular_procurador;
	}


	public void setCelular_procurador(String celular_procurador) {
		this.celular_procurador = celular_procurador;
	}


	public String getTelefono_procurador() {
		return telefono_procurador;
	}


	public void setTelefono_procurador(String telefono_procurador) {
		this.telefono_procurador = telefono_procurador;
	}
	
	
}

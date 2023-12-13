package com.examen.demo.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name="expediente")
public class expediente implements Serializable{

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_expediente;
	private static final long serialVersionUID = 1L;
	
	private String asunto_expediente;
	private Date fecha_inicio_expediente;
	private Date fecha_fin_expediente;
	private String estado_expediente;
	private String cedula_cliente;
	private String nombre_cliente;
	private String direccion_cliente;
	private String telefono_cliente;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_expediente")
	private List<expediente_procuradores> expediente_procuradores;

	public Long getId_expediente() {
		return id_expediente;
	}

	public void setId_expediente(Long id_expediente) {
		this.id_expediente = id_expediente;
	}

	public String getAsunto_expediente() {
		return asunto_expediente;
	}

	public void setAsunto_expediente(String asunto_expediente) {
		this.asunto_expediente = asunto_expediente;
	}

	public Date getFecha_inicio_expediente() {
		return fecha_inicio_expediente;
	}

	public void setFecha_inicio_expediente(Date fecha_inicio_expediente) {
		this.fecha_inicio_expediente = fecha_inicio_expediente;
	}

	public Date getFecha_fin_expediente() {
		return fecha_fin_expediente;
	}

	public void setFecha_fin_expediente(Date fecha_fin_expediente) {
		this.fecha_fin_expediente = fecha_fin_expediente;
	}

	public String getEstado_expediente() {
		return estado_expediente;
	}

	public void setEstado_expediente(String estado_expediente) {
		this.estado_expediente = estado_expediente;
	}

	public String getCedula_cliente() {
		return cedula_cliente;
	}

	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}

	public String getNombre_cliente() {
		return nombre_cliente;
	}

	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}

	public String getDireccion_cliente() {
		return direccion_cliente;
	}

	public void setDireccion_cliente(String direccion_cliente) {
		this.direccion_cliente = direccion_cliente;
	}

	public String getTelefono_cliente() {
		return telefono_cliente;
	}

	public void setTelefono_cliente(String telefono_cliente) {
		this.telefono_cliente = telefono_cliente;
	}

	
	

}

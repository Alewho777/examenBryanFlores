package com.examen.demo.servicios;

import java.util.List;

import com.examen.demo.entity.expediente;


public interface expedienteServicio {
	public List<expediente> findAll();

	public expediente save(expediente expediente);
	public expediente findById(Long id_expediente);
	public void delete(Long id_expediente);
}

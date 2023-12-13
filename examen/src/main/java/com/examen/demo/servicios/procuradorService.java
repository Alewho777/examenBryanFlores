package com.examen.demo.servicios;

import java.util.List;

import com.examen.demo.entity.procurador;


public interface procuradorService {
	public List<procurador> findAll();

	public procurador save(procurador procurador);
	public procurador findById(Long id_procurador);
	public void delete(Long id_procurador);
}

package com.examen.demo.servicios;

import java.util.List;

import com.examen.demo.entity.expediente_procuradores;


public interface expediente_procuradoresServicio {
	public List<expediente_procuradores> findAll();

	public expediente_procuradores save(expediente_procuradores expediente_procuradores);
	public expediente_procuradores findById(Long id_expediente_procuradores);
	public void delete(Long id_expediente_procuradores);
}

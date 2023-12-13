package com.examen.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.examen.demo.entity.procurador;
import com.examen.demo.servicios.procuradorService;


@RestController
@RequestMapping("/api")
public class procuradorControlador {
	@Autowired
	private procuradorService procuradorService;
	
	@GetMapping("/procurador")
	public List<procurador> index(){
		return procuradorService.findAll();
	}
	
	//Buscar procurador
	
	@GetMapping("/procurador/{id_procurador}")
	public procurador show(@PathVariable Long id_procurador) {
		return procuradorService.findById(id_procurador);
	}
	
	//Guardar procurador
	
	@PostMapping("/procurador")
	@ResponseStatus(HttpStatus.CREATED)
	public procurador created(@RequestBody procurador procurador) {
		return procuradorService.save(procurador);
	}
	
	//Editar procurador
	
	@PutMapping("/procurador/{id_procurador}")
	@ResponseStatus(HttpStatus.CREATED)
	public procurador update(@RequestBody procurador procurador,@PathVariable Long id_procurador) {
		procurador procuradorActual= procuradorService.findById(id_procurador);

		procuradorActual.setCedula_procurador(procurador.getCedula_procurador());
		procuradorActual.setNombre_procurador(procurador.getNombre_procurador());
		procuradorActual.setDireccion_procurador(procurador.getDireccion_procurador());
		procuradorActual.setCelular_procurador(procurador.getCelular_procurador());
		procuradorActual.setTelefono_procurador(procurador.getTelefono_procurador());

		return procuradorService.save(procuradorActual);
	}
	
	//Eliminar procurador
	
	@DeleteMapping("/procurador/{id_procurador}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id_procurador) {
		procuradorService.delete(id_procurador);
	}
}

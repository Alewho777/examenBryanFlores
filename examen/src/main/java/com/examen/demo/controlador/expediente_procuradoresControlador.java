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

import com.examen.demo.entity.expediente_procuradores;
import com.examen.demo.servicios.expediente_procuradoresServicio;

@RestController
@RequestMapping("/api")
public class expediente_procuradoresControlador {
	@Autowired
	private expediente_procuradoresServicio expediente_procuradoresServicio;
	
	@GetMapping("/expediente_procuradores")
	public List<expediente_procuradores> index(){
		return expediente_procuradoresServicio.findAll();
	}
	
	//Buscar expediente
	
	@GetMapping("/expediente_procuradores/{id_expediente_procuradores}")
	public expediente_procuradores show(@PathVariable Long id_expediente_procuradores) {
		return expediente_procuradoresServicio.findById(id_expediente_procuradores);
	}
	
	//Guardar expediente
	
	@PostMapping("/expediente_procuradores")
	@ResponseStatus(HttpStatus.CREATED)
	public expediente_procuradores created(@RequestBody expediente_procuradores expediente_procuradores) {
		return expediente_procuradoresServicio.save(expediente_procuradores);
	}
	
	//Editar expediente
	
	@PutMapping("/expediente_procuradores/{id_expediente_procuradores}")
	@ResponseStatus(HttpStatus.CREATED)
	public expediente_procuradores update(@RequestBody expediente_procuradores expediente_procuradores,@PathVariable Long id_expediente_procuradores) {
		return null;
	}
	
	//Eliminar expediente
	
	@DeleteMapping("/expediente_procuradores/{id_expediente_procuradores}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id_expediente_procuradores) {
		expediente_procuradoresServicio.delete(id_expediente_procuradores);
	}
}

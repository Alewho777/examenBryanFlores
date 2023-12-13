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

import com.examen.demo.entity.expediente;
import com.examen.demo.servicios.expedienteServicio;


@RestController
@RequestMapping("/api")
public class expedienteControlador {
	@Autowired
	private expedienteServicio expedienteServicio;
	
	@GetMapping("/expediente")
	public List<expediente> index(){
		return expedienteServicio.findAll();
	}
	
	//Buscar expediente
	
	@GetMapping("/expediente/{id_expediente}")
	public expediente show(@PathVariable Long id_expediente) {
		return expedienteServicio.findById(id_expediente);
	}
	
	//Guardar expediente
	
	@PostMapping("/expediente")
	@ResponseStatus(HttpStatus.CREATED)
	public expediente created(@RequestBody expediente expediente) {
		return expedienteServicio.save(expediente);
	}
	
	//Editar expediente
	
	@PutMapping("/expediente/{id_expediente}")
	@ResponseStatus(HttpStatus.CREATED)
	public expediente update(@RequestBody expediente expediente,@PathVariable Long id_expediente) {
		expediente expedienteActual= expedienteServicio.findById(id_expediente);
		expedienteActual.setAsunto_expediente(expediente.getAsunto_expediente());
		expedienteActual.setFecha_inicio_expediente(expediente.getFecha_inicio_expediente());
		expedienteActual.setFecha_fin_expediente(expediente.getFecha_fin_expediente());
		expedienteActual.setEstado_expediente(expediente.getEstado_expediente());
		expedienteActual.setCedula_cliente(expediente.getCedula_cliente());
		expedienteActual.setDireccion_cliente(expediente.getDireccion_cliente());
		expedienteActual.setTelefono_cliente(expediente.getTelefono_cliente());
		return expedienteServicio.save(expedienteActual);
	}
	
	//Eliminar expediente
	
	@DeleteMapping("/expediente/{id_expediente}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id_expediente) {
		expedienteServicio.delete(id_expediente);
	}
}

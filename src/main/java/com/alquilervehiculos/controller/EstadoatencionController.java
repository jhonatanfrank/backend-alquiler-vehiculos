package com.alquilervehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alquilervehiculos.model.Estadoatencion;
import com.alquilervehiculos.model.Marca;
import com.alquilervehiculos.model.Vehiculo;
import com.alquilervehiculos.service.EstadoatencionService;
import com.alquilervehiculos.service.MarcaService;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/alquilervehiculos/api")
public class EstadoatencionController {
	
	@Autowired
	private EstadoatencionService estadoatencionService;
	
	@PostMapping("/estadosatencion")
	public Estadoatencion save(@RequestBody Estadoatencion estadoatencion) {
		return estadoatencionService.save(estadoatencion);
	}
	
	@GetMapping("/estadosatencion")
	public List<Estadoatencion> estadoatencion() {
		return estadoatencionService.findAll();
	}
	
	@GetMapping("/estadosatencion/{id}")
	public Estadoatencion mostrar(@PathVariable Integer id) {
		return estadoatencionService.findById(id);
	}
	
	
	@PutMapping("/estadosatencion/{id}")
	public Estadoatencion update(@RequestBody Estadoatencion estadoatencion, @PathVariable Integer id) {
		Estadoatencion estadoatencionActual = estadoatencionService.findById(id);
		
		estadoatencionActual.setEstado(estadoatencion.getEstado());
		estadoatencionActual.setNombre(estadoatencion.getNombre());

		return estadoatencionService.save(estadoatencionActual);
	}
	
	@PatchMapping("/estadoatencion/{id}")
	public Estadoatencion updateEstado(@RequestBody Estadoatencion estadoatencion, @PathVariable Integer id) {
		Estadoatencion estadoActual = estadoatencionService.findById(id);
		estadoActual.setEstado(estadoatencion.getEstado());
	    return estadoatencionService.save(estadoActual);
	}	
	
	@DeleteMapping("/estadosatencion/{id}")
	public void delete(@PathVariable Integer id) {
		estadoatencionService.delete(id);
	}
	
}

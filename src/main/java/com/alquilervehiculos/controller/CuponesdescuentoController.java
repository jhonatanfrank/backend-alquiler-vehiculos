package com.alquilervehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alquilervehiculos.model.Alquiler;
import com.alquilervehiculos.model.Cuponesdescuento;
import com.alquilervehiculos.service.CuponesdescuentoService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/alquilervehiculos/api/")
public class CuponesdescuentoController {
	
	@Autowired
	private CuponesdescuentoService cuponesdescuentoService;

	@GetMapping("/cuponesdescuentos")
	public ResponseEntity<List<Cuponesdescuento>> listarCuponesdescuentos() {
		return new ResponseEntity<>(cuponesdescuentoService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/cuponesdescuentos/{id}")
	public Cuponesdescuento mostrarCliente(@PathVariable Integer id) {
		return cuponesdescuentoService.findById(id);
	}
}

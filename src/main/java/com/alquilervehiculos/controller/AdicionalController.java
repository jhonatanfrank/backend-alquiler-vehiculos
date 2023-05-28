package com.alquilervehiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alquilervehiculos.model.Adicional;
import com.alquilervehiculos.model.Alquiler;
import com.alquilervehiculos.service.AdicionalService;
import com.alquilervehiculos.service.AlquilerService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/alquilervehiculos/api/")
public class AdicionalController {
	@Autowired
	private AdicionalService adicionalService;

	@GetMapping("/adicionales")
	public ResponseEntity<List<Adicional>> listarAdicionales() {
		return new ResponseEntity<>(adicionalService.findAll(), HttpStatus.OK);
	}

	@PostMapping("/adicionales")
	public ResponseEntity<Adicional> crearAdicionales(@RequestBody Adicional adicional) {
		return new ResponseEntity<>(adicionalService.save(adicional), HttpStatus.OK);
	}

	@GetMapping("/adicionales/{id}")
	public Adicional mostrarAdicionales(@PathVariable Integer id) {
		return adicionalService.findById(id);
	}

	@PutMapping("/adicionales/{id}")
	public ResponseEntity<Adicional> actualizarAdicionales(@PathVariable Integer id, @RequestBody Adicional adicional) {
		Adicional adicionalesEncontrados = adicionalService.findById(id);

		if (adicionalesEncontrados == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		try {
			adicionalesEncontrados.setNombre(adicional.getNombre());
			adicionalesEncontrados.setFoto(adicional.getFoto());
			adicionalesEncontrados.setPrecio(adicional.getPrecio());


			// alquileresEncontrado.getVehiculo().setId(alquiler.getVehiculo().getId());

			return new ResponseEntity<>(adicionalService.save(adicionalesEncontrados), HttpStatus.CREATED);

		} catch (DataAccessException e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

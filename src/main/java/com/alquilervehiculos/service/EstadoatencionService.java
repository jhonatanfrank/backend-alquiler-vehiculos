package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Estadoatencion;


public interface EstadoatencionService {
	
	public Estadoatencion save(Estadoatencion estadoatencion);

	public Estadoatencion findById(Integer id);

	public List<Estadoatencion> findAll();

	public void delete(Integer id);
	
	public List<Estadoatencion> findByEstadoatencionId(Integer id);
}

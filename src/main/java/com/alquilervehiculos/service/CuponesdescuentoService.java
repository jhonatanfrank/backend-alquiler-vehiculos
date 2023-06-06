package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Cuponesdescuento;

public interface CuponesdescuentoService {
	public Cuponesdescuento save(Cuponesdescuento cuponesdescuento);

	public Cuponesdescuento findById(Integer id);

	public List<Cuponesdescuento> findAll();

	public void delete(Integer id);
	
	public List<Cuponesdescuento> findByCuponesdescuentoId(Integer id);
}

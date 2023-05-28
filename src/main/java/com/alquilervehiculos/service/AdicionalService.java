package com.alquilervehiculos.service;

import java.util.List;

import com.alquilervehiculos.model.Adicional;
import com.alquilervehiculos.model.Tipocombustible;

public interface AdicionalService {
	
	public Adicional save(Adicional adicional);

	public Adicional findById(Integer id);

	public List<Adicional> findAll();

	public void delete(Integer id);
	
	public List<Adicional> findByAdicionalId(Integer id);
}

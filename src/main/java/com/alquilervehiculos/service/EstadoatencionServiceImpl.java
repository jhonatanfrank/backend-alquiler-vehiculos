package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquilervehiculos.dao.EstadoatencionDao;
import com.alquilervehiculos.model.Estadoatencion;
import com.alquilervehiculos.model.Marca;

@Service
public class EstadoatencionServiceImpl implements EstadoatencionService{

	@Autowired
	private EstadoatencionDao estadoatencionDao;

	@Override
	public Estadoatencion save(Estadoatencion estadoatencion) {
		return estadoatencionDao.save(estadoatencion);
	}

	@Override
	public Estadoatencion findById(Integer id) {
		return estadoatencionDao.findById(id).orElse(null);

	}

	@Override
	public List<Estadoatencion> findAll() {
		return (List<Estadoatencion>) estadoatencionDao.findAll();//error aqui
	}

	@Override
	public void delete(Integer id) {
		estadoatencionDao.deleteById(id);		
	}

	@Override
	public List<Estadoatencion> findByEstadoatencionId(Integer id) {
		return (List<Estadoatencion>) estadoatencionDao.findById(id).orElse(null);
	}
	
	

}

package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquilervehiculos.dao.CuponesdescuentoDao;
import com.alquilervehiculos.model.Alquiler;
import com.alquilervehiculos.model.Cuponesdescuento;

@Service
public class CuponesdescuentoServiceImpl implements CuponesdescuentoService{
	
	@Autowired
	private CuponesdescuentoDao cuponesdescuentoDao;

	@Override
	public Cuponesdescuento save(Cuponesdescuento cuponesdescuento) {
		// TODO Auto-generated method stub
		return cuponesdescuentoDao.save(cuponesdescuento);
	}

	@Override
	public Cuponesdescuento findById(Integer id) {
		return cuponesdescuentoDao.findById(id).orElse(null);

	}

	@Override
	public List<Cuponesdescuento> findAll() {
		return (List<Cuponesdescuento>) cuponesdescuentoDao.findAll();

	}

	@Override
	public void delete(Integer id) {
		cuponesdescuentoDao.deleteById(id);		
	}

	@Override
	public List<Cuponesdescuento> findByCuponesdescuentoId(Integer id) {
		return (List<Cuponesdescuento>) cuponesdescuentoDao.findById(id).orElse(null);

	}

	
	
	
}

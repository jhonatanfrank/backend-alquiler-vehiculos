package com.alquilervehiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alquilervehiculos.dao.AdicionalDao;
import com.alquilervehiculos.model.Adicional;
import com.alquilervehiculos.model.Tipocombustible;

@Service
public class AdicionalServiceImpl implements AdicionalService {

	@Autowired
	private AdicionalDao adicionalDao;

	@Override
	public Adicional save(Adicional adicional) {
		return adicionalDao.save(adicional);
	}

	@Override
	public Adicional findById(Integer id) {
		return adicionalDao.findById(id).orElse(null);
	}

	@Override
	public List<Adicional> findAll() {
		return (List<Adicional>) adicionalDao.findAll();
	}

	@Override
	public void delete(Integer id) {
		adicionalDao.deleteById(id);
	}

	@Override
	public List<Adicional> findByAdicionalId(Integer id) {
		return (List<Adicional>) adicionalDao.findById(id).orElse(null);
	}

}

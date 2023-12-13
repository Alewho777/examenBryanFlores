package com.examen.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.demo.dao.expedienteDao;
import com.examen.demo.entity.expediente;


@Service
public class expedienteServicioImpl implements expedienteServicio{
	@Autowired
	private expedienteDao expedienteDao;
	@Override
	@Transactional (readOnly=true)
	public List<expediente> findAll() {
		// TODO Auto-generated method stub
		return (List<expediente>) expedienteDao.findAll();
	}

	@Override
	@Transactional
	public expediente save(expediente expediente) {
		// TODO Auto-generated method stub
		return expedienteDao.save(expediente);
	}

	@Override
	@Transactional (readOnly = true)
	public expediente findById(Long id_expediente) {
		// TODO Auto-generated method stub
		return expedienteDao.findById(id_expediente).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id_expediente) {
		// TODO Auto-generated method stub
		expedienteDao.deleteById(id_expediente);
	}

}

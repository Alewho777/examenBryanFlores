package com.examen.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.demo.dao.expedienteDao;
import com.examen.demo.dao.procuradorDao;
import com.examen.demo.entity.expediente;
import com.examen.demo.entity.procurador;

@Service
public class procuradorServicioImpl implements procuradorService{
	@Autowired
	private procuradorDao procuradorDao;
	@Override
	@Transactional (readOnly=true)
	public List<procurador> findAll() {
		// TODO Auto-generated method stub
		return (List<procurador>) procuradorDao.findAll();
	}

	@Override
	@Transactional 
	public procurador save(procurador procurador) {
		// TODO Auto-generated method stub
		return procuradorDao.save(procurador);
	}

	@Override
	@Transactional (readOnly=true)
	public procurador findById(Long id_procurador) {
		// TODO Auto-generated method stub
		return procuradorDao.findById(id_procurador).orElse(null);
	}

	@Override
	@Transactional 
	public void delete(Long id_procurador) {
		// TODO Auto-generated method stub
		procuradorDao.deleteById(id_procurador);
	}

}

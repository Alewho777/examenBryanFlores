package com.examen.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.demo.dao.expedienteDao;
import com.examen.demo.dao.expediente_procuradoresDao;
import com.examen.demo.entity.expediente;
import com.examen.demo.entity.expediente_procuradores;
@Service
public class expediente_procuradoresServicioImpl implements expediente_procuradoresServicio{
	@Autowired
	private expediente_procuradoresDao expediente_procuradoresDao;
	@Override
	@Transactional (readOnly=true)
	public List<expediente_procuradores> findAll() {
		// TODO Auto-generated method stub
		return (List<expediente_procuradores>) expediente_procuradoresDao.findAll();
	}

	@Override
	@Transactional
	public expediente_procuradores save(expediente_procuradores expediente_procuradores) {
		// TODO Auto-generated method stub
		return expediente_procuradoresDao.save(expediente_procuradores);
	}

	@Override
	@Transactional (readOnly=true)
	public expediente_procuradores findById(Long id_expediente_procuradores) {
		// TODO Auto-generated method stub
		return expediente_procuradoresDao.findById(id_expediente_procuradores).orElse(null);
	}

	@Override
	@Transactional 
	public void delete(Long id_expediente_procuradores) {
		// TODO Auto-generated method stub
		expediente_procuradoresDao.deleteById(id_expediente_procuradores);
	}

}

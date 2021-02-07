package com.desarrollo.servicio.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desarrollo.dao.PruebaDao;
import com.desarrollo.dominio.PruebaDto;
import com.desarrollo.servicio.PruebaServicio;

@Service(value = "BeanServicioPrueba")
@Transactional
public class PruebaServicioImpl implements PruebaServicio {

	@Autowired
	private PruebaDao pruebaDao;

	@Override
	public List<PruebaDto> listar(PruebaDto prmLis) throws SQLException {
		// TODO Auto-generated method stub
		List<PruebaDto> retorno;

		Map<String, Object> filtros = new HashMap<String, Object>();

		retorno = pruebaDao.listar(filtros, null);
		return retorno;
	}

	@Override
	public PruebaDto ver(Integer codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertar(PruebaDto prmIns) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizar(PruebaDto prmAct) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(PruebaDto prmEli) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

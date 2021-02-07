package com.desarrollo.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.desarrollo.dominio.PruebaDto;

public interface PruebaDao {

	public List<PruebaDto> listar(Map<String, Object> parameters, String orderBy) throws SQLException;

	public PruebaDto ver(Integer codigo) throws SQLException;

	public int insertar(PruebaDto prmIns) throws SQLException;

	public int actualizar(PruebaDto prmAct) throws SQLException;

	public int eliminar(PruebaDto prmEli) throws SQLException;

}

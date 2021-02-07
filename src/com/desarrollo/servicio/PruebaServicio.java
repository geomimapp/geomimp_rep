package com.desarrollo.servicio;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import com.desarrollo.dominio.PruebaDto;

public interface PruebaServicio extends Serializable{

	public List<PruebaDto> listar(PruebaDto prmLis) throws SQLException;

	public PruebaDto ver(Integer codigo) throws SQLException;

	public int insertar(PruebaDto prmIns) throws SQLException;

	public int actualizar(PruebaDto prmAct) throws SQLException;

	public int eliminar(PruebaDto prmEli) throws SQLException;

}

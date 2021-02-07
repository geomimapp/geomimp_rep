package com.desarrollo.persistence.util;

import java.util.ArrayList;

public class ParametroNodoObject {

	private ArrayList<ArrayList<Object>> parametros;
	
	public ParametroNodoObject() {
		parametros = new ArrayList<ArrayList<Object>>();
	}

	public ArrayList<ArrayList<Object>> getParametros() {
		return parametros;
	}

	public void setParametros(ArrayList<ArrayList<Object>> parametros) {
		this.parametros = parametros;
	}
	
	public void adicionar(Object campo, Object valor)
	{
		ArrayList<Object> parametro = new ArrayList<Object>();
		parametro.add(campo);
		parametro.add(valor);
		
		getParametros().add(parametro);
	}
}

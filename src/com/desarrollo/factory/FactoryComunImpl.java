package com.desarrollo.factory;

import com.desarrollo.servicio.PruebaServicio;

public class FactoryComunImpl implements FactoryComun{

	private PruebaServicio pruebaServicio;
	
	@Override
	public PruebaServicio getPruebaServicio() {
		// TODO Auto-generated method stub
		return pruebaServicio;
	}

	@Override
	public void setPruebaServicio(PruebaServicio pruebaServicio) {
		// TODO Auto-generated method stub
		this.pruebaServicio = pruebaServicio;
	}

}

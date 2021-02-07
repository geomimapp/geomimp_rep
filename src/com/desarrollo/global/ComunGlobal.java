package com.desarrollo.global;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;

import com.desarrollo.factory.FactoryComun;

@ManagedBean
@Scope("globalSession")
public class ComunGlobal {

	public static ComunGlobal getInstance() {
		String controladora = null;
		controladora = "#{comunGlobal}";
		FacesContext context = FacesContext.getCurrentInstance();

		if (context == null) {
		}

		if (context.getApplication() != null) {
			return context.getApplication().evaluateExpressionGet(context,
					controladora, ComunGlobal.class);
		}
		throw new UnsupportedOperationException();
	}
	
	@ManagedProperty(value = "#{BeanFactoryComun}")
	private FactoryComun factoryComun;

	public FactoryComun getFactoryComun() {
		return factoryComun;
	}

	public void setFactoryComun(FactoryComun factoryComun) {
		this.factoryComun = factoryComun;
	}
	
	
}

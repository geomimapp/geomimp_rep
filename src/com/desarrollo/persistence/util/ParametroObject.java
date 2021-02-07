package com.desarrollo.persistence.util;

import java.util.ArrayList;
import java.util.List;

public class ParametroObject {

	  private List<Parametro> parametros;
		
	    public ParametroObject() 
	    {
	            parametros = new ArrayList<Parametro>();
	    }

	    public List<Parametro> getParametros() {
	        return parametros;
	    }

	    public void setParametros(List<Parametro> parametros) {
	        this.parametros = parametros;
	    }

	    public void adicionar(String parametro, Object objeto)
	    {
	           parametros.add(new Parametro(parametro, objeto));
	    }
	    public class Parametro{
	        private String parametro;
	        private Object objeto;
	        public Parametro(String parametro, Object objeto) {
	            this.parametro = parametro;
	            this.objeto = objeto;
	        }  

	        public String getParametro() {
	            return parametro;
	        }

	        public void setParametro(String parametro) {
	            this.parametro = parametro;
	        }

	        public Object getObjeto() {
	            return objeto;
	        }

	        public void setObjeto(Object objeto) {
	            this.objeto = objeto;
	        }
	        
	    }
	
}

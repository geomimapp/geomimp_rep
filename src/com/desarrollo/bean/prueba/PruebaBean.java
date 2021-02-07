package com.desarrollo.bean.prueba;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.desarrollo.bean.base.BaseBean;
import com.desarrollo.dominio.PruebaDto;
import com.desarrollo.enumerador.BaseEnum.accion_solicitada;
import com.desarrollo.framework.controller.MensajeControllerGenerico;
import com.desarrollo.framework.interfaces.IMantenimientoController;

@ManagedBean
@ViewScoped
public class PruebaBean extends BaseBean implements IMantenimientoController {

	public List<PruebaDto> lstPrueba;
	public PruebaDto objPrueba;

	@Override
	public String iniciarControladora() throws Exception {
		// TODO Auto-generated method stub
		super.PANTALLA_LISTADO = "prueba_listado";
		super.PANTALLA_MANTENIMIENTO = "prueba_mantenimiento";

		buscar();

		return PANTALLA_LISTADO;
	}

	@Override
	public String buscar() throws Exception {
		// TODO Auto-generated method stub
		lstPrueba = getFactoryComun().getPruebaServicio().listar(null);
		return null;
	}

	@Override
	public String nuevo() throws Exception {
		// TODO Auto-generated method stub
		setAccionPantalla(accion_solicitada.NUEVO);
		inicializarDatosMantenimiento();
		return PANTALLA_MANTENIMIENTO;
	}

	@Override
	public String editar() throws Exception {
		// TODO Auto-generated method stub
		setAccionPantalla(accion_solicitada.ACTUALIZAR);
		return PANTALLA_MANTENIMIENTO;
	}

	@Override
	public String ver() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inactivar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ejecutar(String accion) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String guardar() throws Exception {
		// TODO Auto-generated method stub
		if (validar()) {
			if (getAccionPantalla() == accion_solicitada.NUEVO) {
				getFactoryComun().getPruebaServicio().insertar(objPrueba);
			}
		}
		
		buscar();
		
		return PANTALLA_LISTADO;
	}

	@Override
	public String salir() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validar() throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String mensaje(MensajeControllerGenerico mensajeControllerGenerico) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inicializarFiltrosListado() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inicializarDatosMantenimiento() throws Exception {
		// TODO Auto-generated method stub
		objPrueba = new PruebaDto();
		return null;
	}

	public List<PruebaDto> getLstPrueba() {
		return lstPrueba;
	}

	public void setLstPrueba(List<PruebaDto> lstPrueba) {
		this.lstPrueba = lstPrueba;
	}

	public PruebaDto getObjPrueba() {
		return objPrueba;
	}

	public void setObjPrueba(PruebaDto objPrueba) {
		this.objPrueba = objPrueba;
	}

	@Override
	public String descargar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

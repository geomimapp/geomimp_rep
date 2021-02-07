package com.desarrollo.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.desarrollo.constante.CoreConstant;
import com.desarrollo.dao.BaseDao;
import com.desarrollo.dao.PruebaDao;
import com.desarrollo.dominio.PruebaDto;

@Repository
public class PruebaDaoImpl extends BaseDao<PruebaDto> implements PruebaDao {

	@PersistenceContext(unitName = "PU_Geomimp")
	private EntityManager em;
	 
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		if(em==null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Geomimp");
			em = emf.createEntityManager();
		}
		return em;
	}

	public PruebaDaoImpl() {
		super(PruebaDto.class);
	}

	@Override
	public List<PruebaDto> listar(Map<String, Object> parameters, String orderBy) throws SQLException {
		// TODO Auto-generated method stub
		List<PruebaDto> retorno = new ArrayList<>();
		String selectClause = "select p " + buildSelectClause();
		String whereClause = buildWhereClause(parameters);
		String orderClause = buildOrderByClause(orderBy);
		String hql = selectClause + whereClause + orderClause;

		Query q = getEntityManager().createQuery(hql);
		for (Map.Entry<String, Object> map : parameters.entrySet()) {
			q.setParameter(map.getKey(), map.getValue());
		}
		retorno = q.getResultList();
		return retorno;
	}

	@Override
	public PruebaDto ver(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertar(PruebaDto prmIns) throws SQLException {
		// TODO Auto-generated method stub
		int retorno = 0;
		return retorno;

	}

	@Override
	public int actualizar(PruebaDto prmAct) throws SQLException {
		// TODO Auto-generated method stub
		int retorno = 0;
		return retorno;
	}

	@Override
	public int eliminar(PruebaDto prmEli) throws SQLException {
		// TODO Auto-generated method stub
		int retorno = 0;
		return retorno;
	}

	private String buildSelectClause() {
		String selectClause = "from PruebaDto p ";
		return selectClause;
	}

	private String buildWhereClause(Map<String, Object> parameters) {
		String whereClause = "";

		if (parameters.get("nidCentroAtencionCiclo") != null) {
			whereClause = whereClause + "p.nidCentroAtencionCiclo = :nidCentroAtencionCiclo";
		}
		if (parameters.get("cicloCentro") != null) {
			whereClause = (!"".equals(whereClause) ? whereClause + " " + CoreConstant.CONDITION_AND + " " : "");
			whereClause = whereClause + "cac.cicloCentro = :cicloCentro";
		}

		return whereClause;
	}

	private String buildOrderByClause(String orderBy) {
		if (orderBy == null) {
			return "";
		}

		String orderByClause = "";
		String[] orderByArray = orderBy.split(CoreConstant.SEPARATOR_COMA);
		for (String orderByElement : orderByArray) {
			if ("nidCentroAtencionCiclo".equals(orderByElement)) {
				orderByClause = (!"".equals(orderByClause) ? orderByClause + " " + CoreConstant.SEPARATOR_COMA + " "
						: "");
				orderByClause = orderByClause + "cac.nidCentroAtencionCiclo";
			}
		}
		return orderByClause;
	}

}

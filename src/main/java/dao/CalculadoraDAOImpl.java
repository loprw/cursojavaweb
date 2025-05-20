package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entities.CalculadoraEntity;
import utils.Utils;

public class CalculadoraDAOImpl implements CalculadoraDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(CalculadoraDAOImpl.class);

	private Session session;
	
	public CalculadoraDAOImpl() {
		
	}
	
	@Override
	public void insertData(CalculadoraEntity calc) {
		session = Utils.getSession();
		
		try {
			Transaction tx = session.beginTransaction();
			session.persist(calc);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<CalculadoraEntity> getData() {
		session = Utils.getSession();		
		
		String hql = "from CalculadoraEntity c";
		Query<CalculadoraEntity> query = session.createQuery(hql, CalculadoraEntity.class);
		List<CalculadoraEntity> listado = query.list();
		
		if (listado.isEmpty()) {
			logger.info("Listado vacío");
		} else {
			logger.info("Listado con datos");
		}
		
		return listado;
	}
}

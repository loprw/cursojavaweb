package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
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
	public void insertData(CalculadoraEntity entity) {
		session = Utils.getSession();
		
		Transaction tx = session.beginTransaction();
	}

	@Override
	public void getData() {
		session = Utils.getSession();		
	}
}

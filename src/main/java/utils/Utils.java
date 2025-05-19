package utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {

	private static Session session;
	private static final Logger logger = LoggerFactory.getLogger(Utils.class);
	
	private static Session generateSession() {
		
		SessionFactory sf ;
		
			try {
				sf = new Configuration()
						.configure()
						.buildSessionFactory();
				session = sf.openSession();
			} catch (HibernateException he) {
				he.printStackTrace();
			}
		
		return session;
	}
	
	public static Session getSession() {
		
		if (session == null) {
			session = generateSession();
		}
		
		return session;
	}
	
	public static void closeSession() {
		session.close();
	}
}

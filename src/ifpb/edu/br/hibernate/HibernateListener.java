package ifpb.edu.br.hibernate;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import ifpb.edu.br.hibernate.*;

public class HibernateListener implements ServletContextListener{
	
	public void contextInitialized(ServletContextEvent event) {
		HibernateUtil.getSessionFactory();
	}

	public void contextDestroyed(ServletContextEvent event) {
		HibernateUtil.getSessionFactory().close();
	}
	

}

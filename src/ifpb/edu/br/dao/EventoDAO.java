package ifpb.edu.br.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import ifpb.edu.br.entidades.Evento;
import ifpb.edu.br.hibernate.HibernateUtil;

public class EventoDAO extends GenericDAO<Integer, Evento>{
	
	private static EventoDAO instance;

	public static EventoDAO getInstance() {	

		instance = new EventoDAO();		
		return instance;
	}

	@Override
	public Evento find(Evento entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evento> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Evento getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Evento argument = null;

		try {
			session.beginTransaction();
			argument = (Evento) session.get(Evento.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			
			session.close();
			
		}

		return argument;
	}

}

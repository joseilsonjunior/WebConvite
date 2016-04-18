package ifpb.edu.br.bean;

import java.io.IOException;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import javax.faces.context.FacesContext;
import ifpb.edu.br.entidades.Evento;
import ifpb.edu.br.dao.EventoDAO;

@ManagedBean
@RequestScoped
public class EventoBean {
	
	private Evento evento;
	
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public EventoBean(){

		this.evento = new Evento();
	}

	public List<Evento> getEvento(){

		return new EventoDAO().getAll();

	}

	public void inserir() throws IOException{
		
		System.out.println("Aqui");
		
		EventoDAO eventoDAO = new EventoDAO();
		eventoDAO.insert(evento);

		FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml"); 	
	    
	}

	

}

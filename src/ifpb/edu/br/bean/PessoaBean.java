package ifpb.edu.br.bean;

import java.io.IOException;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;
import javax.faces.context.FacesContext;
import ifpb.edu.br.entidades.Pessoa;
import ifpb.edu.br.dao.PessoaDAO;

@ManagedBean
@RequestScoped
public class PessoaBean {
private Pessoa pessoa;
	
	public void setEvento(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PessoaBean(){

		this.pessoa = new Pessoa();
	}

	public List<Pessoa> getPessoa(){

		return new PessoaDAO().getAll();

	}

	public void inserir() throws IOException{
		
		System.out.println("Aqui");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.insert(pessoa);

		FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml"); 	
	    
	}

	


}

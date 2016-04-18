package ifpb.edu.br.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "tb_convidado")
@NamedQuery(name = "Convidado.getAll", query = " from Convidado")
public class Convidado extends Pessoa{
	
	@Column(name = "tipo_convidado")
	private Integer tipo;
	
	@Column(name = "codAcesso")
	private Integer codAcesso;
	
	public Convidado(Integer tipo, Integer codAcesso){
		
		this.codAcesso = codAcesso;
		this.tipo = tipo;
		
	}
	
	public Convidado(){}
	


	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getCodAcesso() {
		return codAcesso;
	}

	public void setCodAcesso(Integer codAcesso) {
		this.codAcesso = codAcesso;
	}

}

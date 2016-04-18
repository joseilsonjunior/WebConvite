package ifpb.edu.br.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_evento")
public class Evento{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Evento")	
	private Integer identidade;

	@Column(name = "nome_evento")
	private String nomeevento;
	
	@Column(name = "data_evento")
	private Date data;
	
	public String getNomeevento() {
		return nomeevento;
	}

	public void setNomeevento(String nomeevento) {
		this.nomeevento = nomeevento;
	}


	public Integer getIdentidade() {
		return identidade;
	}

	public void setIdentidade(Integer identidade) {
		this.identidade = identidade;
	}


	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	

}

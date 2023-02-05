package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String plataforma;
	private Double valor;
	private String nome;

	public Produto() {

	}

	public Produto(Integer id, String plataforma, Double valor, String nome) {
		super();
		this.id = id;
		this.plataforma = plataforma;
		this.valor = valor;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", plataforma=" + plataforma + ", valor=" + valor + ", nome=" + nome + "]";
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}

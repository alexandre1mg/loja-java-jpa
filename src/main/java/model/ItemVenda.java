package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemVenda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer qtd;
	private Double preco;
	
	@ManyToOne
	@JoinColumn(name = "itemvenda_id")
	private Venda venda;
	
	@ManyToOne
	@JoinColumn(name= "produto_id")
	private Produto produto;

	public ItemVenda() {

	}

	

	public ItemVenda(Integer id, Integer qtd, Double preco, Venda venda, Produto produto) {
		super();
		this.id = id;
		this.qtd = qtd;
		this.preco = preco;
		this.venda = venda;
		this.produto = produto;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQtd() {
		return qtd;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	
	
}

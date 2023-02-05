package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;
import model.ItemVenda;
import model.Produto;
import model.Venda;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Cliente cl1 = new Cliente (null,"123.456.789-11","João Silva",11);
		Cliente cl2 = new Cliente (null,"123.456.789-12","Mateus Silva",21);
		Cliente cl3 = new Cliente (null,"123.456.789-13","Beatriz Silva",31);
		
		Produto p1 = new Produto(null,"PC", 250.0, "God of War");
		Produto p2 = new Produto(null,"Xbox", 200.0, "Grounded");
		
		Venda venda = new Venda(null,cl1,sdf.parse("05/02/2023"),450.0);
		
		ItemVenda itv = new ItemVenda(null,1,250.0,venda,p1);
		ItemVenda itv2 = new ItemVenda(null,1,200.0,venda,p2);
		
		venda.getItems().add(itv2);
		venda.getItems().add(itv);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(cl1);
		em.persist(cl2);
		em.persist(cl3);
		em.persist(p1);
		em.persist(p2);
		em.persist(venda);
		em.persist(itv);
		em.persist(itv2);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");

	}

}

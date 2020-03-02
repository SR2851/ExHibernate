package DAO;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Produit;

public class ProduitDAO implements IProduitDAO{
	SessionFactory factory= new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	@Override
	public int createProduit(Produit prod) {
		
		try {
			session.beginTransaction();
			session.save(prod);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int deleteProduit(int idProduit) {

		
		try {
			session.beginTransaction();
			Produit produit = new Produit();
			produit.setIdProduit(idProduit);
			session.delete(produit);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

}

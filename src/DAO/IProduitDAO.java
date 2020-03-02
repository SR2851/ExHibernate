package DAO;

import model.Produit;

public interface IProduitDAO {
public int createProduit(Produit prod);
public int deleteProduit(int idProduit);
	
}

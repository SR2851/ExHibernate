package Main;

import DAO.IProduitDAO;
import DAO.ProduitDAO;
import model.Produit;

public class Main {
	public static void main(String[] args) {
		Produit prod=new Produit(56, "Armoire", "");
		IProduitDAO daoP=new ProduitDAO();
		daoP.createProduit(prod);
		//daoP.deleteProduit(5);
	}

}

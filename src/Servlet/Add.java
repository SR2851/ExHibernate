package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.IProduitDAO;
import DAO.ProduitDAO;
import model.Produit;

/**
 * Servlet implementation class Add
 */
@WebServlet("/add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/form.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Produit prod=new Produit();
		prod.setNomProduit(request.getParameter("nom"));
		prod.setDescription(request.getParameter("description"));
		IProduitDAO daoP=new ProduitDAO();
		int i=daoP.createProduit(prod);
		if(i==1) {
			request.setAttribute("message", "Produit ajouté avec succès");
		}
		else {
			request.setAttribute("message", "Erreur lors de l'ajout du produit");
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/produits.jsp").forward(request, response);
	}

}

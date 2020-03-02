import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Produits")
public class Produit {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idProduit;
private String nomProduit;

@Transient
private String description;

public Produit(int idProduit, String nomProduit, String description) {
	super();
	this.idProduit = idProduit;
	this.nomProduit = nomProduit;
	this.description = description;
}
public Produit() {
	super();
}
public int getIdProduit() {
	return idProduit;
}
public void setIdProduit(int idProduit) {
	this.idProduit = idProduit;
}
public String getNomProduit() {
	return nomProduit;
}
public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}



}

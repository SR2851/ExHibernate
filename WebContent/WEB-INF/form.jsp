<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Formulaire</title>
</head>
<body>
<form action="/ExHibernate/add" method="post">
<div>
<label>Nom du produit</label>
<input type="text" name="nom" placeholder="Entrer le nom du produit" >
<label>Description</label>
<textarea name="description" placeholder="Décrire le produit" ></textarea> 
</div>
<div>
<input type="submit" name="valider" value="Valider">
</div>
</form>

</body>
</html>
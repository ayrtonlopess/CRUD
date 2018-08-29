<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Contatos</title>
</head>
<link href="http://cdn.jsdelivr.net/webjars/bootstrap/3.3.7/css/bootstrap.css"
      href="@{/webjars/bootstrap/3.3.7/css/bootstrap.css}" rel="stylesheet" media="screen"/>
<body>
		<div class="container" style="margin-top: 40px">
		<a class="btn btn-default" href="novo">Novo</a>
		<a class="btn btn-default" href="index">Home</a>
		
		<table class="table table-hover" style="margin-top: 20px">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Nome</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>			
				<c:forEach var="lista" items="${listaCartorios}">
					
					<th>${lista.id}</th>
					<td>${lista.nome}</td>									
					 
					<td>
						<a class="btn btn-info" href='<c:url value="/excluir/${lista.id}"/>'>Excluir</a>
						<a class="btn btn-danger" href='<c:url value="/editar/${lista.id}"/>'>Editar</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
<script src="http://cdn.jsdelivr.net/webjars/jquery/3.2.1/jquery.min.js" src="@{/webjars/jquery/3.2.1/jquery.min.js}"></script>	
</body>
</html>
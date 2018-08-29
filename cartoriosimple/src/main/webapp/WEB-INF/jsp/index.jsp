<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cartorio Do Foda</title>
<link href="http://cdn.jsdelivr.net/webjars/bootstrap/3.3.7/css/bootstrap.css"
      th:href="@{/webjars/bootstrap/3.3.7/css/bootstrap.css}" rel="stylesheet" media="screen"/>
</head>
<body>
		<div class="container" style="margin-top: 40px">
	
		<div class="jumbotron">
		<h1 class="display-4">Cartorio Simples</h1>
		<hr class="my-4">
		<p>Aqui voce pode Listar ou adicionar um novo!</p>

 		<a class="btn btn-primary btn-lg" href="listar">Listar</a>
        <a class="btn btn-primary btn-lg" href="novo">Novo</a>
	
<script src="http://cdn.jsdelivr.net/webjars/jquery/3.2.1/jquery.min.js" th:src="@{/webjars/jquery/3.2.1/jquery.min.js}"></script>
</body>
</html>
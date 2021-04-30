<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add tarefas</title>
</head>
<body>

	<h2>Página inicial da Lista de Tarefas</h2>
	
	<p>Bem vindo, ${usuarioLogado.login} <a href="logout">Sair</a></p>
	<a href="listaTarefas">Clique aqui</a> para acessar a lista de tarefas
	
</body>
</html>
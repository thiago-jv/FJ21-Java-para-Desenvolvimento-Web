<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add tarefas</title>
</head>
<body>
	
	<h2>Página de Login das Tarefas</h2>

    <form action="efetuaLogin" method="post">
    
    Login: <input type="text" name="login" />
    <br />
    
    Senha: <input type="password" name="senha" />
    <br />

    <input type="submit" value="Entrar nas tarefas" />

</form>
	
</body>
</html>
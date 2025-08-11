<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<title>Cdastrar Endereço</title>
</head>
<body>
	<h1>Cadastrar Endereço</h1>
	<form action="${pageContext.request.contextPath}/inserir-endereço" method="post">
		<label for="cep">CEP</label><br/>
		<input type="text" id="cep" name="cep" required></input><br/><br/>
		
		<label for="logradouro">Logradouro</label><br/>
		<input type="text" id="logradouro" name="lagradouro" required></input><br/><br/>

		<label for="numero">Número</label><br/>
		<input type="text" id="numero" name="numero" required></input><br/><br/>
		
		<label for="complemeto">Complemento</label><br/>
		<input type="text" id="complemento" name="complemento" required></input><br/><br/>
				
		<label for="bairro">Bairro</label><br/>
		<input type="text" id="bairro" name="bairro"></input><br/><br/>

		<label for="cidade">Cidade</label><br/>
		<input type="text" id="cidade" name="cidade" required></input><br/><br/>

		<label for="estado">Estado</label><br/>
		<input type="text" id="estado" name="estado" required></input><br/><br/>
	
		<button type="submit">Cadastrar</button>
	
	</form>
</body>
</html>

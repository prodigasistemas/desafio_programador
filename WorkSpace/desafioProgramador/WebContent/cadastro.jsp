<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
}

li {
    display: inline;
}
</style>
<body>
<ul>
  <li>Upload</li>
  <li><a href="mostrarDados.jsp">Mostrar dados</a></li>
</ul>

<form action='readfile' method='post'>
    <input type='file' name='nomeArquivo'><br>
    <input type='submit' name='butao' value='upload'>
</form>


</body>
</html>
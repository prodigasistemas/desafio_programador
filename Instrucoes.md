# Instruções

1 - O sistema é utlizado na ide Eclipse
2 - Para rodar é necessario abrir o projeto eclipse
3 - Na aba Servers em baixo, criar um novo servidor com o Tomcat v7.0
4 - Após o next adicionar o projeto na parte de configured e clicar em finish
5 - Clicar com o botão direito no projeto, Run as e Run on server
6 - Colocar o arquivo na pasta WorkSpace\desafioProgramador\src
7 - Abrir o sistema web no site http://localhost:8080/desafioProgramador/cadastro.jsp
8 - Abrir o arquivo e clicar em upload, o sistema irá abrir o arquivo normaliza-lo e inserir no bano
9 - na aba Mostrar dados uma tabela dos dados inseridos no banco de dados é mostrada

## Falhas no sistema

1 - Tem que configurar o caminho absoluto do arquivo e do arquivo de bando de dados do SQLITE
2 - O do arquivo a linha se encontra no arquivo java LerArquivo.java na linha 79
3 - E o do arquivo do banco de dados se encontra no arquivo criarConexao na linha 14
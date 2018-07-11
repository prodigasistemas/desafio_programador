# Desafio de Programação
A idéia deste desafio é nos permitir avaliar melhor as suas habilidades em programação, de vários níveis.

Este desafio deve ser feito por você em sua casa. Gaste o tempo que você quiser, porém, normalmente você não deve precisar de mais do que algumas horas.

## Instruções de Entrega do Desafio
1. Primeiro, faça um fork deste projeto para sua conta no Github (crie uma se você não possuir).
2. Em seguida, implemente o projeto tal qual descrito abaixo, em seu próprio fork.
3. Por fim, empurre todas as suas alterações para o seu fork no Github e envie um pull request para este repositório original.

## Descrição do Projeto
Você recebeu um arquivo de texto com os dados de contato dos funcionários de uma empresa. Precisamos criar uma maneira para que estes dados sejam importados para um banco de dados. Sua tarefa é criar uma interface WEB que aceite upload desse arquivo, normalize os dados e armazene-os em um banco de dados relacional.

## Sua aplicação web DEVE:

1. Aceitar (via um formulário) o upload de um arquivo de texto com o conteúdo separados por ponto e vírgula com as seguintes colunas: name, phone, email. Você pode assumir que as colunas estarão sempre nesta ordem e que sempre haverá dados em cada coluna. Um arquivo de exemplo chamado employee_contacts.txt foi adicionado neste repositório.
2. Interpretar ("parsear") o arquivo recebido, normalizar os dados, e salvar corretamente a informação em um banco de dados relacional.
3. Exibir a listagem dos contatos salvos no banco de dados através do arquivo enviado após o upload + parser.
4. Ser escrita obrigatoriamente em Ruby 2.0+ ou Java 7+.
5. Ser simples de configurar e rodar, funcionando em ambiente compatível com Unix (Linux ou Mac OS X). Ela deve utilizar apenas linguagens e bibliotecas livres ou gratuitas.

## Sua aplicação web NÃO precisa:

1. Ser escrita usando algum framework específico (use o que achar melhor).
2. Lidar com autenticação ou autorização (pontos extras se ela fizer).

## Avaliação
Seu projeto será avaliado de acordo com os seguintes critérios:

1. Sua aplicação preenche os requerimentos básicos?
2. Você documentou a maneira de configurar o ambiente e rodar sua aplicação?
3. Você seguiu as instruções de entrega do desafio?

Adicionalmente, tentaremos verificar a sua familiarização com as bibliotecas padrões (standard libs), bem como sua experiência com programação orientada a objetos a partir da estrutura de seu projeto.

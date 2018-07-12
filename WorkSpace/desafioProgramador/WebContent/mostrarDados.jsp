<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="consultaDados()">
 <div id="resposta"></div>
</body>

    <script type="text/javascript">
        var httpObject;
        function processaResposta(){
            if(httpObject.readyState==4){
             document.getElementById("resposta").innerHTML=httpObject.responseText;
            }
        }
        function requisicaoAjax(url){
            if (window.XMLHttpRequest){
                httpObject=new XMLHttpRequest();
            }else if (window.ActiveXObject){
        httpObject=new ActiveXObject("Microsoft.XMLHTTP");
        }else{
            alert("Navegador não suporta Ajax");
        }
        httpObject.onreadystatechange=processaResposta;
        httpObject.open("GET",url,true);
        httpObject.send(null);
         }
         function consultaDados(){
         html="";
        requisicaoAjax("readfile?"); 
    }
 </script> 
 
</html>
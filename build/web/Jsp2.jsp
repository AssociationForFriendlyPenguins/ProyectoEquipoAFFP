<%-- 
    Document   : Jsp2
    Created on : 4 abr. 2022, 15:56:45
    Author     : HOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tu nombre significa</h1>
        <%
            String valor = null;
            valor = request.getParameter("aa1");
            if (valor == "Adriana") {
                println("Antigua ciudad a orillas del Mar Adrático");
            } else {
                if (valor == "Julio") {
                    println("Joven, deriva de los jóvenes que recién tienen barba");
                }else{
                    if (valor == "Itztli"){
                        println("Obsidiana");
                    }else{
                        if (valor == "cuarto nombre"){
                            println("Significado cuarto nombre");
                        }
                    }
                }
            }
                
            
            
            %>
        <br/>
    </body>
</html>

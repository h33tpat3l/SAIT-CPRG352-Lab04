<%-- 
    Document   : viewNote
    Created on : 7 Jun, 2022, 2:31:38 PM
    Author     : het
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
            <h1> Simple Note Keeper </h1>
            <br>
            <h2> View Note </h2>
            <br>
            <p>
                title: ${note.title}
                <br>
                Contents: ${note.content}
            </p>
            <a href="note?editNote"> Edit Note </a>
      
    </body>
</html>

<%-- 
    Document   : editNote
    Created on : 7 Jun, 2022, 2:32:05 PM
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
        <form method="post" action="note">
        <h1>Simple Note Keeper</h1>
        <br>
        <h2>Edit Note</h2>
        <br>
        <label>Title:</label>
        <input type="text" name="title" value=${note.title}>
        <br>
        <label>Contents:</label>
        <textarea name="content">${note.content}</textarea>
        <br>
        <input type="submit" value="save">
        </form>
    </body>
</html>

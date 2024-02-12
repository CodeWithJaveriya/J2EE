<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update List</title>
</head>
<h1> ${ updateMessage} </h1>
<body>
<form action="/updationList" method ="post">
Sl No: <input type="text" name="userId" value="${user.getId()}" readonly><br>
First Name: <input type="text" name="firstName" value="${user.getFirstName()}"><br>
Last Name: <input type="text" name="lastName" value="${user.getLastName()}"><br>
Address: <input type="text" name="address" value="${user.getAddress()}"><br>
Fees: <input type="text" name="fees" value="${user.getFees()}"><br>
<input type="update" value="UPDATE">
</from>
</body>
</html>
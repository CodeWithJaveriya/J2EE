<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registrations</title>
</head>
<h1> ${ registrationSuccessful }</h1>
<body>
<form action="/register" method ="post">
First Name: <input type="text" name="firstName"><br>
Last Name: <input type="text" name="lastName"><br>
Address: <input type="text" name="address"><br>
Fees: <input type="text" name="fees"><br>
<input type="submit" value="SUBMIT">
</from>
</body>
</html>
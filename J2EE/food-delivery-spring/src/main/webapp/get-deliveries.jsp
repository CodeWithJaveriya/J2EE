<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Get All Users</title>
</head>
<body>
<a href="getAll">GET ALL USERS</a>
<hr>
<form action="searchByUserName" method="get">
<input type="search" name="userName" placeholder="search by username">

<input type="submit" value="search">
</form>
<hr>
<table border=1>
<tr>
<th>Sl No</th>
<th>Username</th>
<th>Address</th>
<th>Food Name</th>
<th>Food Quantity</th>
<th>Phone Number</th>
<th>Email</th>
<th>Action</th>
</tr>
<c:forEach items="${lists}" var="list">
<tr>
<td>${list.getId()}</td>
<td>${list.getUserName()}</td>
<td>${list.getAddress()}</td>
<td>${list.getFoodName()}</td>
<td>${list.getFoodQuantity()}</td>
<td>${list.getPhoneNumber()}</td>
<td>${list.getEmail()}</td>
<td><a href="update?id=${list.getId()}">Update</a>
    &nbsp; &nbsp; &nbsp;
    <a href="delete?id=${list.getId()}">Delete</a>
    </td>
</tr>
</c:forEach>
</table>
</body>
</html>
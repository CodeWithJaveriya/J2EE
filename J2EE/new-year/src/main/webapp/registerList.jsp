<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Get Users List</title>

  <style>
    table {
      width: 70%;
      border-collapse: collapse;
      margin-top: 20px;
    }

    th, td {
      padding: 10px;
      text-align: left;
      border: 1px solid #ddd;
    }

    th {
      background-color: rgb(41, 118, 211);
    }

    tr:hover {
      background-color: #f5f5f5;
    }
  </style>

</head>

<body>
<a href="users">Get All Users</a>
<table border="1">
  <thead >
    <tr>
      <th>Sl No</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Address</th>
      <th>Fees</th>
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${usersList}" var="user">
      <tr>
                  <td>${user.getId()}</td>
                  <td>${user.getFirstName()}</td>
                  <td>${user.getLastName()}</td>
                  <td>${user.getAddress()}</td>
                  <td>${user.getFees()}</td>
                  <td><a href="update?userId=${user.getId()}">Update</a>
                  &nbsp; &nbsp; &nbsp;
                  <a href="delete?userId=${user.id}">Delete</a>
                  </td>
      </tr>
      </c:forEach>
      </tbody>
</table>

</body>
</html>

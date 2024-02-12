<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Get Details List</title>

  <style>
    table {
      width: 100%;
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
<a href="details">Get All Details</a>

<table border="1">
  <thead >
    <tr>
      <th>Sl No</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Email</th>
      <th>Phone Number</th>
      <th>Mode of payment</th>
      <th>Check in date</th>
      <th>Check out date</th>
      <th>Adults</th>
      <th>Children</th>
      <th>Rooms</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${ bookingsList }" var="book">
      <tr>
                  <td>${book.bookingId}</td>
                  <td>${book.firstName}</td>
                  <td>${book.lastName}</td>
                  <td>${book.email}</td>
                  <td>${book.phoneNumber}</td>
                  <td>${book.modeOfPayment}</td>
                  <td>${book.checkInDate}</td>
                  <td>${book.checkOutDate}</td>
                  <td>${book.adults}</td>
                  <td>${book.children}</td>
                  <td>${book.rooms}</td>
      </tr>
      </c:forEach>
      </tbody>
</table>

</body>
</html>
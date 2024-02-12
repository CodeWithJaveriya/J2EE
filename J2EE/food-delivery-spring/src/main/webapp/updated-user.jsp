<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Update Your Order Here!!!</h2>



<form action="updatedFood" method="post">

<input type="hidden" name="id" value="${list.getId()}"></br>
User Name: <input type="text" name="userName" value="${list.getUserName()}"><br>
Address: <input type="text" name="address" value="${list.getAddress()}"><br>
Food Name: <input type="text" name="foodName" value="${list.getFoodName()}"><br>
Food Quantity: <input type="text" name="foodQuantity" value="${list.getFoodQuantity()}"><br>
Phone Number: <input type="text" name="phoneNumber" value="${list.getPhoneNumber()}"><br>
Email: <input type="text" name="email" value="${list.getEmail()}"><br><hr>
<button>UPDATE</button>

</form>

</body>
</html>

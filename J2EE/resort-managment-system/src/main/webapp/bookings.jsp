<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Book Your Stay</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f8f9fa;
      margin: 0;
      padding: 0;
    }
 header {
   background-color: #007bff;
   color: #fff;
   padding: 3px;
   text-align: center;
   display: flex;
   justify-content: center; /* Center the content horizontally */
   align-items: center;
   position: relative;
 }

 header img {
   width: 80px;
   position: absolute;
   left: 10px; /* Adjust the left position based on your preference */
 }
    .main-content {
      padding: 20px;
      flex-grow: 1;
    }
    form {
      max-width: 600px;
      margin: 0 auto;
    }
    label {
      display: block;
      margin-bottom: 8px;
    }
    input,
    select {
      width: 100%;
      padding: 8px;
      margin-bottom: 16px;
      box-sizing: border-box;
    }
    button {
      padding: 10px;
      background-color: #007bff;
      color: #fff;
      border: none;
      cursor: pointer;
    }
    footer {
    background-color: #343a40;
      color: #fff;
      text-align: center;
      padding: 10px 0;
      width: 100%;
    }
  </style>
</head>
<body>

  <header>
    <img src="img.png" alt="Logo">
    <h1>Book Your Stay</h1>
  </header>

  <div class="main-content">
    <form action="bookings" method="post" id="bookingForm" onsubmit="return validateForm()">
      <label name="firstName">First Name:</label>
      <input type="text" id="firstName" name="firstName" required>

      <label name="lastName">Last Name:</label>
      <input type="text" id="lastName" name="lastName" required>

      <label name="email">Email:</label>
      <input type="email" id="email" name="email" required>

      <label name="phoneNumber">Contact Number:</label>
      <input type="tel" id="phoneNumber" name="phoneNumber" required>

      <label name="modeOfPayment">Mode of Payment:</label>
      <select id="modeOfPayment" name="modeOfPayment" required>
        <option value="" disabled selected>Select payment method</option>
        <option value="creditCard">Credit Card</option>
        <option value="debitCard">Debit Card</option>
        <option value="paypal">PayPal</option>
      </select>

      <label name="checkInDate">Check-In Date:</label>
      <input type="date" id="checkInDate" name="checkInDate" required>

      <label name="checkOutDate">Check-Out Date:</label>
      <input type="date" id="checkOutDate" name="checkOutDate" required>

      <label name="adults">Adults:</label>
      <input type="number" id="adults" name="adults" min="1" required>

      <label name="children">Children:</label>
      <input type="number" id="children" name="children" min="0" required>

      <label name="rooms">Rooms:</label>
      <input type="number" id="rooms" name="rooms" min="1" required>

      <button type="submit" id="submitButton">Submit</button>
      <button type="reset">Reset</button>
    </form>
  </div>

  <footer>
    <p>&copy; 2023 Book Your Stay. All rights reserved.</p>
    <p id="currentDateTime"></p>
  </footer>

  <script>
    function validateForm() {
      // Implement your validation logic here
      // Return true if the form is valid, otherwise return false
      var form = document.getElementById('bookingForm');
      if (form.checkValidity()) {
        // Form is valid, you can submit it
        alert('Form submitted successfully!');
        return true;
      } else {
        // Form is invalid, do not submit
        alert('Please fill in all mandatory fields.');
        return false;
      }
    }

    function updateDateTime() {
      var now = new Date();
      var formattedDateTime = now.toLocaleString('en-US', { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric', hour: 'numeric', minute: 'numeric', second: 'numeric', timeZoneName: 'short' });
      document.getElementById('currentDateTime').innerHTML = formattedDateTime;
    }

    // Update date and time every second
    setInterval(updateDateTime, 1000);

    // Initial update
    updateDateTime();
  </script>

</body>
</html>

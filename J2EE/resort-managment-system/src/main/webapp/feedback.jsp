<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title> Purple Pams Resort</title>
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
      padding: 10px;
      text-align: left;
      display: flex;
      justify-content: space-between;
      align-items: center;
    }
    header img {
      width: 80px;
    }
    .main-content {
      padding: 20px;
    }
    form {
      max-width: 600px;
      margin: 0 auto;
    }
    label {
      display: block;
      margin-bottom: 8px;
    }
    input, textarea {
      width: 100%;
      padding: 8px;
      margin-bottom: 16px;
      box-sizing: border-box;
    }
    button {
      padding: 10px;
      margin-right: 10px;
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
    }
  </style>
</head>
<body>

  <header>
    <img src="img.png" alt="Logo">
    <a href="index.jsp">Home</a>
  </header>

  <div class="main-content">
    <form action="feedback" method="post" id="commentForm" onsubmit="return validateForm()">
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" required>

      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required>

      <label for="comments">Comments:</label>
      <textarea id="comments" name="comments" rows="4" required></textarea>

      <button type="submit">Submit</button>
      <button type="reset">Reset</button>
    </form>
  </div>

  <footer>
    <p>&copy; 2023 Purple Pams Resort. All rights reserved.</p>
    <p id="currentDateTime"></p>
  </footer>

  <script>
    function validateForm() {
      var name = document.getElementById('name').value;
      var email = document.getElementById('email').value;
      var comments = document.getElementById('comments').value;

      // Validate name
      if (name.length < 3 || !/^[a-zA-Z ]+$/.test(name)) {
        alert('Name should have more than 3 characters and should not contain numbers or special characters.');
        return false;
      }

      // Validate email
      if (!email.endsWith('@gmail.com')) {
        alert('Email should end with @gmail.com.');
        return false;
      }

      // Validate comments
      if (comments.length < 25) {
        alert('Comments should have at least 25 characters.');
        return false;
      }

      // If all validations pass, you can submit the form
      alert('Form submitted successfully!');
      return true;
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

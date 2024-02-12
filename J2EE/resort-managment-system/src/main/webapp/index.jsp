<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Purple Pams Resort</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #f8f9fa;
      color: #495057;
    }
    header {
      background-color: #6f42c1;
      color: #fff;
      padding: 5px;
      text-align: center;
    }
    header img {
      width: 80px; /* Adjust the size based on your logo */
    }
    .footer {
      background-color: #343a40;
      color: #fff;
      text-align: center;
      padding: 5px 0;
      position: fixed;
      bottom: 0;
      width: 100%;
    }
    .footer a {
      color: #fff;
      margin: 0 10px;
    }
          .social-icons-footer {
          display: flex;
          justify-content: center;
          margin-top: 10px;
        }

        .social-icons-footer a {
          color: white;
          margin: 0 10px;
          font-size: 20px;
        }
    .main-content {
      padding: 20px;
    }
    .resort-photo {
      margin-bottom: 20px;
      display: flex;
      flex-wrap: wrap;
      justify-content: space-between;
    }


      .resort-photo .col-md-3 {
        width: calc(50% - 10px); /* Set width for two photos with 10px margin in between */
        margin-bottom: 20px;
      }

      .resort-photo img {
        width: 100%;
        height: 200px; /* Set a fixed height for all photos */
        object-fit: cover; /* Maintain aspect ratio and cover the entire container */
      }

      .resort-photo h4 {
        margin-top: 10px;
        font-size: 16px;
      }
  </style>
</head>
<body>


<header>
    <img src="img.png" alt="Logo">
    <h1>Purple Pams Resort</h1>
    <div class="header-buttons">
      <a href="index.jsp" class="btn btn-primary">Home</a>
      <a href="bookings.jsp" class="btn btn-primary">Bookings</a>
      <a href="feedback.jsp" class="btn btn-primary">Feedback</a>
      <a href="view-details.jsp" class="btn btn-primary">View Details</a>
    </div>
  </header>

 <div class="main-content">
    <div class="container">
      <div class="row resort-photo">
        <div class="col-md-3">
          <img src="img_1.png" class="img-fluid" alt="Resort Photo 1">
          <h4>Entrance of beautiful resort</h4>
        </div>
        <div class="col-md-3">
          <img src="img_2.png" class="img-fluid" alt="Resort Photo 2">
          <h4>Swimming and relaxing side</h4>
        </div>
        <div class="col-md-3">
          <img src="img_3.png" class="img-fluid" alt="Resort Photo 3">
          <h4>Over Night resort view</h4>
        </div>
        <div class="col-md-3">
          <img src="img_4.png" class="img-fluid" alt="Resort Photo 4">
          <h4>Garden area of resort</h4>
        </div>
      </div>
    </div>
  </div>


  <div class="footer">
    <div class="social-icons-footer">
      <a href="https://www.instagram.com/" target="_blank"><i class="fab fa-instagram"></i></a>
      <a href="https://github.com/" target="_blank"><i class="fab fa-github"></i></a>
      <a href="https://www.linkedin.com/" target="_blank"><i class="fab fa-linkedin"></i></a>
    </div>
    <p>&copy; 2023 Purple Pams Resort. All rights reserved.</p>
    <p id="currentDateTime"></p>
  </div>


  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

  <script src="https://kit.fontawesome.com/your-font-awesome-kit.js"></script>

  <script>
    function updateDateTime() {
      var now = new Date();
      var formattedDateTime = now.toLocaleString('en-US', { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric', hour: 'numeric', minute: 'numeric', second: 'numeric', timeZoneName: 'short' });
      document.getElementById('currentDateTime').innerHTML = formattedDateTime;
    }


    setInterval(updateDateTime, 1000);


    updateDateTime();
  </script>
</body>
</html>


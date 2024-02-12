<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
            text-align: center;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #555;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button {
            background-color: #4caf50;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<h1>Blog Posts</h1>

<form action="blog" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required>

    <label for="content">Content:</label>
    <input type="text" id="content" name="content" required>

    <label for="author">Author:</label>
    <input type="text" id="author" name="author" required>

    <label for="creationDate">Creation Date:</label>
    <input type="text" id="creationDate" name="creationDate" required>

    <label for="category">Category:</label>
    <input type="text" id="category" name="category" required>

    <button type="submit">Add Post</button>
</form>

<hr>

</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: dat
  Date: 13/05/2020
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Product Discount Calculator</title>
</head>
<body>
<form action="/display-discount" method="post">
    <div style="margin-left: 500px;border: 2px solid black;width: 155px">
        Product Description:<input type="text" name="Product Description"> <br> <br>
        List Price:<input type="text" name="List Price"> <br> <br>
        Discount Percent:<input type="text" name="Discount Percent"><br> <br>
        <button type="submit">Calculate Discount</button>
    </div>

</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/05/2020
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>[Bài tập] Ứng dụng Product Discount Calculator</title>
  </head>
  <body>
    <h1>Product Discount Calculator</h1>
    <form method="get" action="/display-discount">
      <label>Product Description</label>
      <input type="text" name="productDescription">
      <br>
      <label>List price</label>
      <input type="text" name="listPrice">
      <br>
      <label>Discount percent</label>
      <input type="text" name="discountPercent">
      <br>
      <input type="submit" value="Calculate Discount">
    </form>
  </body>
</html>

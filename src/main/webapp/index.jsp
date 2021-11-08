<%--
  Created by IntelliJ IDEA.
  User: Thai Vu
  Date: 08-Nov-21
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/calculator" method="post">
    <label>Description</label><br/>
    <input type="text" name="Description" placeholder="mo ta"/><br/>
    <label>List price</label><br/>
    <input type="text" name="price" placeholder="gia"/><br/>
    <label>Discount percent</label><br/>
    <input type="text" name="percent" placeholder="phan tram"><br/>
    <input type="submit"  value="Search"/>
  </form>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: milkias
  Date: 2019-03-12
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/WEB-INFForm/index2.css" type="text/css" rel="stylesheet" />
</head>
<body>
</body>
<h1> Submission</h1>
<form method="post" action="/Support">
<label>Name:<input type="text" name="name" id="name" ></label>
<label>Email: <input type="email" name="email" id="email" placeholder="trmilkias@gmail.com"></label>
<label>Problem <input type="text" name="prb" id="problem"></label>
    <label>Problem Description <br><textarea  name="prbDescp" rows="10px"cols="20px"> </textarea></label>
 <label>Help!!<input type="submit"></label>
</form>

</body>
</html>

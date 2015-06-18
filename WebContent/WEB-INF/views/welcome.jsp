<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome user</title>
<style type="text/css">@import url("<c:url value="/resource/css/style.css"/>");</style>
</head>
<body>
<div class="logout-container"> <a href="<c:url value="/login"/>"> Logout </a> </div>
<h3> Welcome  ${userModel.username} </h3> <br/>
 <div class="welcome-page"> <a href="listings"> Show all ToDo lists</a> | <a href="add"> Add new ToDo list</a></div>

</body>
</html>
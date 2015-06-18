<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page import="com.springmaid.domain.User" %>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All users</title>
<style type="text/css">@import url("<c:url value="/resource/css/style.css"/>");</style>
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="<c:url value="/resource/js/common.js"/>"></script>
<script src="<c:url value="/resource/js/ajax.js"/>"></script>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Courgette" />
</head>
<body>
<div class="logout-container"> <a href="<c:url value="/login"/>"> Logout </a> </div>
<h2>All Users</h2>
 <%  
      
       ArrayList<User> list = new ArrayList();
        list = (ArrayList<User>)request.getAttribute("users");
       %>
       <% for (int i=0;i<list.size();i++)
          {
          %>
  
	<div class="container">
		
		<div>
			<div class="todo-container">
				<div class="status-checkbox"><input type="checkbox"></div>
				<div >User Name:  <%out.print(list.get(i).getName()); %></div>
				<div >UerID:  <%out.print(list.get(i).getUserID()); %></div>
				<div >Email: <%out.print(list.get(i).getEmail()); %></div>
				<a href="#" onclick="callAjax(1)"> Enable</a>
				<a href="#" onclick="callAjax(0)"> Disable</a>
			</div>
		</div>
		

	</div>
	<%} %>
</body>
</html>
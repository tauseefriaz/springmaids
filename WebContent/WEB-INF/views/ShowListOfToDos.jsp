<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page import="com.springmaid.domain.ToDo" %>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring ToDo - Listings</title>
<style type="text/css">@import url("<c:url value="/resource/css/style.css"/>");</style>
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="<c:url value="/resource/js/common.js"/>"></script>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Courgette" />
</head>
<body>
<div class="logout-container"> <a href="<c:url value="/login"/>"> Logout </a> </div>
    <%  
      
       ArrayList<ToDo> list = new ArrayList();
        list = (ArrayList<ToDo>)request.getAttribute("todos");
       %>
       <% for (int i=0;i<list.size();i++)
          {
          %>
              

          

	<div class="container">
		<h2>My Spring ToDO Items</h2>
		<div>
			<div class="todo-container">
				<div class="status-checkbox"><input type="checkbox"></div>
				<div class="todo-title"><%out.print(list.get(i).getTitle()); %></div>
				<div class="todo-details" id="1"><a href="# expand">[+]</a></div>
				<div class="todo-actions"><a href="#">[Delete]</a> <a href="#">[Done]</a></div>
				<div class="todo-desc" id="todo-desc-1"><%out.print(list.get(i).getDescription()); %></div>
			</div>
			
		</div>
		
	
	
	<%} %>
</body>
</html>
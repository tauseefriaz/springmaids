<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page trimDirectiveWhitespaces="true" %>
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
	<div class="container">
		
		<c:forEach var="todos" begin="1" end="20">
			<div>
				<div class="todo-container">
					<div class="status-checkbox"><input type="checkbox"></div>
					<div class="todo-title">${todo.dateTime} ${todo.title}</div>
					<div class="todo-details" id="${todo.id}"><a href="# expand">[+]</a></div>
					<div class="todo-actions"><a href="#">[Delete]</a> <a href="#">[Done]</a></div>
				</div>
				<div class="todo-desc" id="todo-desc-${todo.id}"><b>Description:</b> ${todo.description}</div>
			</div>
		</c:forEach> 
		
		
		<h2>My Spring ToDO Items</h2>
		<div>
			<div class="todo-container">
				<div class="status-checkbox"><input type="checkbox"></div>
				<div class="todo-title">11/06 10:11 Buy Coffee Beans</div>
				<div class="todo-details" id="1"><a href="# expand">[+]</a></div>
				<div class="todo-actions"><a href="#">[Delete]</a> <a href="#">[Done]</a></div>
			</div>
			<div class="todo-desc" id="todo-desc-1"><b>Description:</b> Have to buy coffee for for coffee maker!</div>
		</div>
		
		<div>
			<div class="todo-container">
				<div class="status-checkbox"><input type="checkbox"></div>
				<div class="todo-title">11/06 12:00 Water The Plants</div>
				<div class="todo-details" id="2"><a href="# expand">[+]</a></div>
				<div class="todo-actions"><a href="#">[Delete]</a> <a href="#">[Done]</a></div>
			</div>
			<div class="todo-desc" id="todo-desc-2"><b>Description:</b> Here are the details buddy!</div>
		</div>
		
		<div>
			<div class="todo-container">
				<div class="status-checkbox"><input type="checkbox"></div>
				<div class="todo-title">17/06 09:30 WAA Doc Delivery</div>
				<div class="todo-details" id="3"><a href="# expand">[+]</a></div>
				<div class="todo-actions"><a href="#">[Delete]</a> <a href="#">[Done]</a></div>
			</div>
			<div class="todo-desc" id="todo-desc-3"><b>Description:</b> Here are the details buddy!</div>
		</div>
		<div style="margin-top:20px;"><a href="<c:url value="todo/add/"/>">Create ToDo</a></div>
	</div>
</body>
</html>
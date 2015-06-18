
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring ToDo - Login</title>
<style type="text/css">@import url("<c:url value="/resource/css/style.css"/>");</style>
</head>
<body>

	<div class="container">
		<div class="home-container">
			<h3> Welcome to Spring maids TODO list home page</h3> 
			<p>  
				<a href="<c:url value="/login"/>">Login</a> <br>
				<a href="<c:url value="/register"/>">Register</a>
			</p>
		</div>
	</div>
</body>
</html>
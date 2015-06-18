<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring ToDo - New Item</title>
<style type="text/css">@import url("<c:url value="/resource/css/style.css"/>");</style>
</head>
<body>
<div class="logout-container"> <a href="<c:url value="/login"/>"> Logout </a> </div>
<form:errors   path="*" cssStyle="color : red"/>
	<div class="container">
		<div class="login-container">
			<div class="form-title">Create New ToDo</div> 
			<form:form commandName="todoModel" action="save" method="POST">
  				<form:input id="title" path="title" type="text" placeholder="Title" class="input-field"/>
  				<form:errors  path="title" cssStyle="color : red "  />
  				<form:input id="description" path="description" type="text" placeholder="Description" class="input-field"/>
  				<form:errors  path="description" cssStyle="color : red "  />
            	<input id="submit" type="submit" value="Save ToDo" class="btn">
    		</form:form >
		</div>
	</div>
</body>
</html>
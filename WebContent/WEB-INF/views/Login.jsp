<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
		<div class="login-container">
			<div class="form-title">Login</div>
			<form:form  commandName="userModel"  method="POST">
  				<form:input id="username" path="username"  class="input-field"/>
  				<form:errors  path="username" cssStyle="color : red "  />
  				<form:input id="password" type="password" path="password"  class="input-field"/>
  				<form:errors  path="password" cssStyle="color : red "  />
            	<input id="submit" type="submit" value="Login" class="btn" /> | <a href="<c:url value="/register"/>">Register</a>
    		</form:form>
		</div>
	</div>
</body>
</html>
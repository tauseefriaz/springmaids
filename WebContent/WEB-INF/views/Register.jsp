<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring ToDo - Register</title>
<style type="text/css">@import url("<c:url value="/resource/css/style.css"/>");</style>
</head>
<body>
<form:errors  path="*" cssStyle="color : red "  />
	<div class="container">
		<div class="login-container">
		<div class="pull-right" style="padding-right:50px">
                <a href="?language=en" >English</a>|<a href="?language=fr">French </a>
            </div>
			<div class="form-title">Register</div>
			<form:form commandName="userModel" method="POST">
                            
                            
  				<label for="username"><spring:message code="register.form.username.label"/> </label>
  				<form:input id="username" path="username" type="text" placeholder="Username" class="input-field"/>
  				
  				<form:errors  path="username" cssStyle="color : red "  />
                <label for="password"><spring:message code="register.form.password.label"/> </label>              
  				<form:input id="password" path="password" type="password" placeholder="Password" class="input-field"/>
  				 
  				<form:errors  path="password" cssStyle="color : red "  />
                <label for="name"><spring:message code="register.form.fullname.label"/> </label>                
  				<form:input id="name" path="name" type="text" placeholder="Full Name" class="input-field"/>
  				
  				<form:errors  path="name" cssStyle="color : red "  />
                <label for="phone"><spring:message code="register.form.phonenumber.label"/> </label>               
  				<form:input id="phone" path="phone" type="text" placeholder="Phone Number" class="input-field"/>
  				
  				<form:errors  path="phone" cssStyle="color : red "  />
                <label for="email"><spring:message code="register.form.emailaddress.label"/> </label>               
  				<form:input id="email" path="email" type="text" placeholder="Email Address" class="input-field"/>
  				
  				<form:errors  path="email" cssStyle="color : red "  />
            	<input id="submit" type="submit" value="Register" class="btn"> | <a href="<c:url value="/login"/>">Already registered?</a>
    		</form:form >
		</div>
		
		
	</div>
</body>
</html>
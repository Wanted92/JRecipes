<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!-- ---------------------------------------------------------------------------------------------- -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign in</title>
</head>
<body>
	<f:form method="POST" action="${pageContext.request.contextPath}/doNewUser" commandName="user">
		Name: <f:input type="text" path="name" name="name" placeholder="Name"/><br/>
		Surname: <f:input type="text" path="surname" name="surname" placeholder="Surname"/><br/>
		Email: <f:input type="email" path="email" name="email" placeholder="Email"/><br/>
		Nickname: <f:input type="text" path="nickname" name="nickname" placeholder="Nickname"/><br/>
		Password: <f:input type="password" path="password" name="password" placeholder="Password"/><br/>
		Password 2:<f:input type="password" path="password2" name="password" placeholder="Password 2"/><br/>

		Nation: <f:input type="text" path="nation" name="nation" placeholder="Nation"/><br/>
		Job: <f:input type="text" path="job" name="job" placeholder="Job"/><br/><br/>
		Born date: <f:input type="date" path="bornDate" name="bornDate" placeholder="Born date"/><br/><br/>
		<input type="submit" name="submit" value="Sign in">
	</f:form>
</body>
</html>
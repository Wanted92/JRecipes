<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!-- ---------------------------------------------------------------------------------------------- -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/script/registrationForm.js"></script>

<link href="${pageContext.request.contextPath}/static/css/registrationForm.css" rel="stylesheet" type="text/css" />
<title>Sign in</title>
</head>
<body>
	<f:form method="POST" action="${pageContext.request.contextPath}/doNewUser" commandName="user">
		Name: <f:input type="text" path="name" name="name" placeholder="Name"/><f:errors path="name" cssClass="error"></f:errors><br/>
		Surname: <f:input type="text" path="surname" name="surname" placeholder="Surname"/><f:errors path="surname" cssClass="error"></f:errors><br/>
		Email: <f:input type="email" path="email" name="email" placeholder="Email"/><f:errors path="email" cssClass="error"></f:errors><br/>
		Nickname: <f:input type="text" path="nickname" name="nickname" placeholder="Nickname"/><f:errors path="nickname" cssClass="error"></f:errors><br/>
		Password: <f:input type="text" path="password" id="password" placeholder="Password"/><f:errors path="password" cssClass="error"></f:errors><br/>
		Password 2:<input type="password" id="password2" placeholder="Password 2" onkeyup="checkPass()"/> <span id="alertPasswordMismatch"></span><br/>

		Nation: <f:select path="nation">
					 	<sql:query var="rs" dataSource="jdbc/jrecipes">
	 				 		select name from countries
				 		</sql:query>
			 			<c:forEach var="row" items="${rs.rows}">
					 		<f:option value="${row.name}"></f:option>
						</c:forEach>
					</f:select><br/>
		Job: <f:input type="text" path="job" name="job" placeholder="Job"/><br/><br/>
		Born date: <f:input type="date" path="bornDate" name="bornDate" placeholder="Like: 1970-12-24"/><br/><br/>
		<input type="submit" name="submit" value="Sign in">
	</f:form>
</body>
</html>
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
<link href="${pageContext.request.contextPath}/static/css/jquery-ui-1.10.4.custom.css" rel="stylesheet" type="text/css" />
<title>Insert new Recipe</title>
</head>
<body>
	<f:form method="POST" commandName="recipe">
	 	<h4>Name:</h4> <f:input type="text" path="name" name="name" placeholder="Title" /><br/>
	 	Nationality: <f:select path="nationality">
					 	<sql:query var="rs" dataSource="jdbc/jrecipes">
	 				 		select name from countries
				 		</sql:query>
			 			<c:forEach var="row" items="${rs.rows}">
					 		<f:option value="${row.name}"></f:option>
						</c:forEach>
					</f:select><br/>
		Region: <f:input type="text" path="region" name="region" placeholder="Region" /><br/>
		<!-- 
		Difficulty: <f:input type="number" path="difficulty" name="difficulty" placeholder="Difficulty" /><br/>
		Price: <f:select path="price">
			   		<f:option value="Low"></f:option>
			   		<f:option value="Medium"></f:option>
			   		<f:option value="High"></f:option>
			   </f:select><br/>
		Preparation Time: <f:input type="number" path="preparationTime" name="preparationTime" placeholder="Preparation time" /><br/>
		Cooking Time: <f:input type="number" path="cookingTime" name="cookingTime" placeholder="Cooking time" /><br/>
		 -->
	</f:form>
</body>
</html>
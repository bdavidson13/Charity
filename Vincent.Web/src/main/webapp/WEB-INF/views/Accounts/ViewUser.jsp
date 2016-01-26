<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<html>
<head>
	<title>View Account</title>
</head>
<body>
<h1>
	View You Account
</h1>

<form:form method="post" modelAttribute="userForm" 
      action="${pageContext.request.contextPath}/UpdateUser">
	<form:input path="firstName" type="text" id="fName" placeholder="First Name" />              
	<form:input path="lastName" type="text" id="lName" placeholder="Last Name" />
	<form:input path="email" type="text" id="email" placeholder="Email" />	
	<form:input path="userName" type="text" id="uName" placeholder="User Name*" />
	<form:input path="password" type="password" id="pword" placeholder="Password" />
</form:form>
</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Create User</title>
</head>
<body>
<h1>
	Create User 
</h1>
<h2>
Thank you for Choosing to participate. We hope your desires to help are rewarded.
We just need a bit of information from you :
</h2>
<form:form method="post" modelAttribute="userForm" 
      action="${pageContext.request.contextPath }/CreateUser">
	<form:input path="firstName" type="text" id="fName" placeholder="First Name" />              
	<form:input path="lastName" type="text" id="lName" placeholder="Last Name" />
	<form:input path="email" type="text" id="email" placeholder="Email" />	
	<form:input path="userName" type="text" id="uName" placeholder="User Name*" />
	<form:input path="password" type="password" id="pword" placeholder="Password" />
	<input type="submit" value="submit" />		
</form:form>
</body>
</html>

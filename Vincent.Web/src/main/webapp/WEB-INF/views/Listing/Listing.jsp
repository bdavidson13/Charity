<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Listing Page</title>
</head>
<body>
<h1>
	This will Be the Listing Page  
</h1>
<div> ${testBase}</div>
<jsp:include page="/WEB-INF/views/Listing/Partial-Views/passingDataTest.jsp" />
<div>Things Needed:</div>
<c:forEach items="" var=""></c:forEach>
<ul>
	<li>A way of displaying a list of Volunteer opportunities :
		<ul>
			<li>What gets Displayed?</li>
			<li>Paging or Infinite scrolling?</li>
			<li>What does an opportunity look like?</li>
		</ul>
	</li>
	<li>A way of Filtering Oppurtunities</li>
	<li>Map :
		<ul>
			<li>Do we want a map?</li>
			<li>If so, in this View or another view?</li>
			<li>Which api to use? Bing? Google? Other?</li>
		</ul>
	</li>
</ul>
</body>
</html>

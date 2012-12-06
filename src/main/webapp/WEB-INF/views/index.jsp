<%@ include file="/WEB-INF/views/include.jsp"%>

<c:set var="now" value="<%=new java.util.Date()%>" />

<html>
<body>
	<h2>videoRenter</h2>
	<small>Current time is: <fmt:formatDate value="${now}"
			pattern="hh:mm MMM d, yyyy" /> </small>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><title>Example :: Spring Application</title></head>
<body>
<h1>Hello - Spring Attendee Application</h1>
<p>Attendees.</p>
<c:forEach items="${attendees}" var="attendee">
	<c:out value="${attendee.name}" />
</c:forEach>
</body>
</html>
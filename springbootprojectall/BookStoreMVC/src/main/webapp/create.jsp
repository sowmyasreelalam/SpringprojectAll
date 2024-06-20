<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Enter Book Details</h1><br><br>
<form:form action="save" modelAttribute="book">
 <form:label path="id">ID </form:label>
 <form:input path="id"/>
 
 
 <form:label path="book_name">BookName:</form:label>
 <form:input path="book_name"/>
 
 <form:label path="book_author">BookAuthor:</form:label>
 <form:input path="book_author"/>
 
 <form:label path="book_price">bookPrice:</form:label>
 <form:input path="book_price"/>
 
 <input type="submit" value="save Book Detials">
 
 
 
 
 
 
</form:form>

</body>
</html>
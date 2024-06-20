<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h1>ENTER EMPLOYEE DETAILS</h1><br><br>
  <form:form action="save" modelAttribute="employee">
  
  <form:label path="id">ID</form:label>
  <form:input path="id"/>
  
  <form:label path="name">name</form:label>
  <form:input path="name"/>
  
  <form:label path="designtion">designtion</form:label>
  <form:input path="designtion"/>
  
  <form:label path="salary">salary</form:label>
  <form:input path="salary"/>
  
  <input type="submit" value="SAVE EMPLOYEE">
  
  </form:form>


</body>
</html>
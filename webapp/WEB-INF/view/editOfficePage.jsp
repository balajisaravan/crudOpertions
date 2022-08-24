<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Page</title>
</head>
<body>

<h1 align="center" style="font-style: italic">here we are prepopulating by id</h1>

<h1 align="center" style="font-style: italic">Edit Employee</h1>

<c:url value = "/office/saveEdit" var="saveEdit"/>
<form:form method="post" action="${saveEdit}" modelAttribute="ediByID">
    <table align="center" border="3">
        <tr>
            <td></td>
            <td><form:hidden  path="workerID" /></td>
        </tr>
        <tr>
            <td>Worker Name :</td>
            <td><form:input path="workerName"/></td>
        </tr>
        <tr>
            <td>Worker Designation :</td>
            <td><form:input path="workerDesignation"/></td>
        </tr>
        <tr>
            <td>Worker Salary :</td>
            <td><form:input path="workerSalary"/></td>
        </tr>
        <tr>
            <td> </td>
            <td><input type="submit" value="Save" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>

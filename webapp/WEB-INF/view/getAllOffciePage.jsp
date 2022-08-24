<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>officePage</title>

</head>
<body>

<br>

<h1 align="center" style="font-style: italic">this page called plp where we can see list of workers</h1>

<table align="center" border="4" width="70%" cellpadding="2">
    <tr>
        <th style="">Worker Id</th>
        <th>Worker Name</th>
        <th>Worker Designation</th>
        <th>Worker Salary</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="officeDto" items="${officeDtoData}">
        <tr>
            <td> <a href="getById/${officeDto.workerID}" >${officeDto.workerID}</a> </td>
            <td>${officeDto.workerName}</td>
            <td>${officeDto.workerDesignation}</td>
            <td>${officeDto.workerSalary}</td>
            <td> <a href="edit/${officeDto.workerID}">Edit</a></td>
            <td> <a href="deleteByID/${officeDto.workerID}">Delete</a> </td>
        </tr>
    </c:forEach>
</table>
<br/>

<a href="add">Add Worker</a>

</body>

</html>

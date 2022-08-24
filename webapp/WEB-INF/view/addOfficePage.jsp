<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Office</title>

    <style type="text/css">
        .error {
            color: red;
            position: fixed;
            text-align: left;
            margin-left: 30px;
        }
    </style>
</head>
<body>

<h1 align="center" style="font-style: italic">Add new Worker</h1>
<form:form method="post" action="saveAdd" modelAttribute="officeDto">
    <table align="center" border="3">
        <tr>
            <td>Worker ID :</td>
            <td><form:input path="workerID"/></td>
            <td><form:errors path="workerID" cssClass="error"></form:errors></td>
        </tr>
        <tr>
            <td>Worker Name :</td>
            <td><form:input path="workerName"/></td>
            <td><form:errors path="workerName" cssClass="error"></form:errors></td>
        </tr>
        <tr>
            <td>Worker Designation :</td>
            <td><form:input path="workerDesignation"/></td>
            <td><form:errors path="workerDesignation" cssClass="error"></form:errors></td>
        </tr>
        <tr>
            <td>Worker Salary :</td>
            <td><form:input path="workerSalary"/></td>
            <td><form:errors path="workerSalary" cssClass="error"></form:errors></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ID Page</title>
</head>
<body>

<h2 align="center" style="font-style: italic">this page called pld where we can see details of individual user</h2>

<h1 align="center" style="font-style: italic">Worker ID Page</h1>

<table align="center"  border="3" width="60%" cellpadding="3">
    <tr>
        <td>Worker ID</td>
        <td>Worker Name</td>
        <td>Worker Designation</td>
        <td>WorkerSalary</td>
    </tr>

    <tr>
        <td>${getByWorkerID.workerID}</td>
        <td>${getByWorkerID.workerName}</td>
        <td>${getByWorkerID.workerDesignation}</td>
        <td>${getByWorkerID.workerSalary}</td>
    </tr>
</table>

</body>
</html>

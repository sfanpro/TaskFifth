<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Costumer registration form</title>

    <style>
        .error {
            color: red
        }
    </style>
</head>

<body>

<i>Fill out form. Asterisk (*) means required.</i>

<br><br>

<form:form action="processForm" modelAttribute="customer">
    First name(*): <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br><br>
    Last name(*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    Free passes(*): <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br><br>
    Postal code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br><br>
    Own code: <form:input path="ownCode"/>
    <form:errors path="ownCode" cssClass="error"/>
    <br><br>
    <input type="submit" value="submit">
</form:form>

</body>
</html>

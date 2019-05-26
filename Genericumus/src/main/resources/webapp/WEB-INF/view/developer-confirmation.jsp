<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Developer Confirmation</title>
</head>

<body>

The developer is confirmed:  ${developer.firstName} ${developer.lastName}

<br><br>

Country: ${developer.country}

<br><br>

Gender: ${developer.gender}

<br><br>

Skills:

<ul>
    <c:forEach var="temp" items="${developer.skill}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

</body>

</html>

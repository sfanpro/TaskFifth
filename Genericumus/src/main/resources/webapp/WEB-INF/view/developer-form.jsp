<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Developer registration form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="developer">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">

        <form:options items="${developer.countryOptions}"/>

    </form:select>
    <br><br>

    Select your gender:
    Male <form:radiobutton path="gender" value="Male"/>
    Female <form:radiobutton path="gender" value="Female"/>

    <br><br>

    Select your skills:
    <ul>
        <li><form:checkbox path="skill" value="Java SE" />Java SE</li>
        <li><form:checkbox path="skill" value="Java EE" />Java EE</li>
        <li><form:checkbox path="skill" value="Git" />Git</li>
        <li><form:checkbox path="skill" value="JUnit" />JUnit</li>
        <li><form:checkbox path="skill" value="Maven" />Maven</li>
        <li><form:checkbox path="skill" value="Gradle" />Gradle</li>
        <li><form:checkbox path="skill" value="Tomcat" />Tomcat</li>
        <li><form:checkbox path="skill" value="MySQL" />MySQL</li>
        <li><form:checkbox path="skill" value="XML" />XML</li>
        <li><form:checkbox path="skill" value="JSP" />JSP</li>
        <li><form:checkbox path="skill" value="JSF" />JSF</li>
        <li><form:checkbox path="skill" value="JavaScript" />JavaScript</li>
        <li><form:checkbox path="skill" value="HTML" />HTML</li>
        <li><form:checkbox path="skill" value="CSS" />CSS</li>
        <li><form:checkbox path="skill" value="Vaadin" />Vaadin</li>
        <li><form:checkbox path="skill" value="Grails" />Grails</li>
        <li><form:checkbox path="skill" value="JHipster" />JHipster</li>
        <li><form:checkbox path="skill" value="Play" />Play</li>
        <li><form:checkbox path="skill" value="Vert.X" />Vert.X</li>
        <li><form:checkbox path="skill" value="Hibernate" />Hibernate</li>
        <li><form:checkbox path="skill" value="Spring" />Spring</li>
    </ul>

    <br><br>
    <input type="submit" value="Submit">
</form:form>

</body>


</html>
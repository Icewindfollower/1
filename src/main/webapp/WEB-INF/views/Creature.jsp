<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html>
<html>
<head>
<title>${creature.name}</title>
</head>

<body>

<h1>${creature.attack}</h1>
<img src="/test-mvn-app/resources/images/image1.jpg" width=500>

<h2><font color=orange face=arial>${creature.name}</font> <h2>


</body>
</html>
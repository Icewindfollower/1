<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html>
<html>
<head>
<title>Герой снежных эльфов</title>
</head>

<body>

<h1>${user.name}</h1>
<a href="http://fc03.deviantart.net/fs71/i/2012/326/4/2/ancient_magic_by_mavrosh-d5lt5sv.jpg"><img src="http://fc03.deviantart.net/fs71/i/2012/326/4/2/ancient_magic_by_mavrosh-d5lt5sv.jpg" width=500 </a>

<h2><font color=orange face=arial>Заклинатель 1-ого уровня</font> <h2>
        <c:if test="${not empty lists}">

<ul>
        <c:forEach var="listValue" items="${lists}">
        				<li><a href="/test-mvn-app/creature/${listValue}">${listValue}</a><br></li>
        			 </c:forEach>

</ul>
       </c:if>

</body>
</html>
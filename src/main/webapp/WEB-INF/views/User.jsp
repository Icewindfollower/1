<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<title>Герой снежных эльфов</title>
</head>
<link href="/test-mvn-app/resources/css/main.css" rel="stylesheet" />
<body>

<h1>${user.name}</h1>
<h1>${creature.name}</h1>
<img src="http://fc03.deviantart.net/fs71/i/2012/326/4/2/ancient_magic_by_mavrosh-d5lt5sv.jpg" width=500 </a>
<h2><font color=orange face=arial>Заклинатель 1-ого уровня</font> <h2>
            <c:forEach var="slots" items="${slots}">
                 <div style="display: inline-block;"><a href="/test-mvn-app/creature/${creature.name}">${creature.name}</a>
                 <br><img src=${Slots.url} width=300>

                 <form action="" method="POST">
                    <label class="position">Позиция</label>
                    <input type="text" name="position" class="form_text"><br>
                    <input type="submit" value="Добавить" class="formbutton">
                 </form>

                 <form action="" method="DELETE">
                    <label class="position">Позиция</label>
                    <input type="text" name="position" class="form_text"><br>
                    <input type="submit" value="Удалить" class="formbutton">
                 </form>
                 </div>
            </c:forEach>
</body>
</html>
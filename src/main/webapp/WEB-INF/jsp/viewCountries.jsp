<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<header>
<title>Treasure Game</title>
<link type="text/css" rel="stylesheet" href="css/treasure.css"/>
</header>
<body>
<div class="wrapper">
    <h1>Find treasure</h1>
    <p class="desc">Treasure exist in below countries. You need to go to these countries to find the treasure. Only you found all the treasure, you can win this game. Let's go to find it!</p>

    <ul>

    <c:forEach var="country" items="${countries}" >
    <li><a href="${flowExecutionUrl}&_eventId=submit&country=${country}">${country}</a></li>
    </c:forEach>

    </ul>

</div>
</body>
</html>
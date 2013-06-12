<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<header>
<title>Treasure Game</title>
<link type="text/css" rel="stylesheet" href="css/treasure.css"/>
</header>
<body>

<div class="wrapper">

<h1>Treasure Game</h1>
<p class="desc">
This is a treasure finding game. You need to go to different countries to find the treasure.
</p>

<div>
    <a href="${flowExecutionUrl}&_eventId=viewCountries">Start to Hunting</a>
</div>

<c:if test="${not empty treasureFound}">
<h3>Treasure you found</h3>
<c:forEach items="${treasureFound}" var="item" >
<div class="Treasure"><span><c:out value="${item.key}"/></span> at <label><c:out value="${item.value}"/></label></div>
</c:forEach>
</c:if>

</div>
</body>
</html>

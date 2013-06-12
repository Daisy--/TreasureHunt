<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<header>
<title>Treasure Game</title>
<link type="text/css" rel="stylesheet" href="css/treasure.css"/>
</header>
<body>
<div class="wrapper">
    <h1>You are in ${country}</h1>
    <c:if test="${not empty treasure}">
        You found <div class="treasure"><span>${treasure}</span></div>
        <a href="${flowExecutionUrl}&_eventId=addTreasure&treasure=${treasure}">Hunting</a>
    </c:if>
    <c:if test="${empty treasure}">
        <div>Sorry, it's not in here.</div>
        <a href="${flowExecutionUrl}&_eventId=continueToHunt">Continue to Hunt</a>
    </c:if>

</div>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<header>
<title>Treasure Game</title>
<link type="text/css" rel="stylesheet" href="css/treasure.css"/>
</header>
<body>
<div class="wrapper">
    <h1>Congratulations! You have successfully submitted your new score!</h1>
    <p>${score} has been submitted!</p>
    <a href = "${flowExecutionUrl}&_eventId=returnToIndex">Return to index</a>
</div>
</body>
</html>
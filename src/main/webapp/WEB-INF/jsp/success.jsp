<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<header>
<title>Treasure Game</title>
<link type="text/css" rel="stylesheet" href="css/treasure.css"/>
</header>
<body>
<div class="wrapper">
    <h1>${score} score!Congratulations! You have just found all the treasure! Now you can:</h1>
    <ul>
    <li><a href="${flowExecutionUrl}&_eventId=startAgain">Start Again</a></li>
    <li><a href="${flowExecutionUrl}&_eventId=submitYourScore">Submit Your Score</a></li>
    </ul
</div>
</body>
</html>
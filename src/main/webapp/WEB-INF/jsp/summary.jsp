<html>

<head>
<title>Cricket Summary - Pak vs Eng</title>
</head>

<body>
    <p><b>Iterated List:</b><p>

        <ol>
            <c:forEach var="emp" items="${summaryList}">
            
                <li>${emp.team.name}</li>
                
            </c:forEach>
        </ol>
</body>

</html>
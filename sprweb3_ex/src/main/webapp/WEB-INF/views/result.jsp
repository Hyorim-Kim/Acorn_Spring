<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gugudan</title>
</head>
<body>
    <h1>구구단 출력</h1>
    <table border="1">
        <c:forEach var="i" begin="2" end="9">
            <tr>
                <td>${i}단</td>
                <c:forEach var="j" begin="1" end="9">
                    <td>${i} x ${j} = ${i * j}</td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
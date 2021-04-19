<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI</title>
</head>
<body>
<form name="bmiForm" action="calculateServlet" method="POST">
    <p>Сгенерированная картинка </p>
    <a href="SendPicture.jsp">Загрузка</a>
    <img src="ResponseImageServlet" alt="Сгенерированная">

</form>


</body>
</html>

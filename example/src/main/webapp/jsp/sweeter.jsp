<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>상의</title>
</head>
<body>
<h1>선택</h1>
<form action="/sweeter/order" method="post">
    <select id="sweeter" name="sweeterName">
        <option value="니트">니트</option>
        <option value="자켓">자켓</option>
        <option value="맨투맨">맨투맨</option>
        <option value="후드티">후드티</option>
    </select>
    <input type="number" min="0" max="5" step="1" name="sweeterAmount">
    <button type="submit">선택완료</button>
</form>
</body>
</html>

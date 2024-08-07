<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>하의</title>
</head>
<body>
    <h1>선택</h1>
    <form action="/pants/order" method="post">
        <select id="pants" name="pantsName">
            <option value="청바지">청바지</option>
            <option value="슬랙스">슬랙스</option>
            <option value="면바지">면바지</option>
        </select>
        <input type="number" min="0" max="5" step="1" name="pantsAmount">
        <button type="submit">선택완료</button>
    </form>
</body>
</html>

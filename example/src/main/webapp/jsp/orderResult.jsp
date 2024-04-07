<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String clothName = (String) request.getAttribute("clothName");
        int clothAmount = (Integer) request.getAttribute("clothAmount");
        int clothPrice = (Integer) request.getAttribute("clothPrice");
    %>

    <h3>주문하신 옷 : <%= clothName %></h3>
    <h3>주문하신 수량 : <%= clothAmount %>개</h3>
    <h3>결제하실 최종 금액 : <%= clothPrice %>원</h3>
</body>
</html>

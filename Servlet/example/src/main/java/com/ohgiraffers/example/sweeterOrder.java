package com.ohgiraffers.example;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/sweeter/order")
public class sweeterOrder extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String sweeterName = request.getParameter("sweeterName");
        int sweeterAmount = Integer.parseInt(request.getParameter("sweeterAmount"));

        System.out.println("sweeterName = " + sweeterName);
        System.out.println("sweeterAmount = " + sweeterAmount);

        int sweeterPrice = 0;

        switch (sweeterName) {
            case "니트" : sweeterPrice = 80000 * sweeterAmount; break;
            case "자켓" : sweeterPrice = 150000 * sweeterAmount; break;
            case "멘투멘" : sweeterPrice = 50000 * sweeterAmount; break;
            case "후드티" : sweeterPrice = 70000 * sweeterAmount; break;
        }

        request.setAttribute("clothName", sweeterName);
        request.setAttribute("clothAmount", sweeterAmount);
        request.setAttribute("clothPrice", sweeterPrice);

        RequestDispatcher rd = request.getRequestDispatcher("/jsp/orderResult.jsp");
        rd.forward(request, response);
    }
}

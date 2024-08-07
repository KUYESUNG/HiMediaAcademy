package com.ohgiraffers.example;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/pants/order")
public class pantsOrder extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String pantsName = request.getParameter("pantsName");
        int pantsAmount = Integer.parseInt(request.getParameter("pantsAmount"));

        System.out.println("pantsName = " + pantsName);
        System.out.println("amount = " + pantsAmount);

        int pantsPrice = 0;

        switch (pantsName) {
            case "청바지" : pantsPrice = 30000 * pantsAmount; break;
            case "슬랙스" : pantsPrice = 45000 * pantsAmount; break;
            case "면바지" : pantsPrice = 18000 * pantsAmount; break;
        }

        request.setAttribute("clothName", pantsName);
        request.setAttribute("clothAmount", pantsAmount);
        request.setAttribute("clothPrice", pantsPrice);

        RequestDispatcher rd = request.getRequestDispatcher("/jsp/orderResult.jsp");
        rd.forward(request, response);
    }
}

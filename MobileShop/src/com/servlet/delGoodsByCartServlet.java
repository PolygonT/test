package com.servlet;

import com.domain.Mobile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/delGoodsByCartServlet")
public class delGoodsByCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();

        String integer = request.getParameter("integer");

        Map<Integer,Mobile> map =(Map<Integer,Mobile>) session.getAttribute("cart");

        Integer key = Integer.parseInt(integer);
        map.remove(key);

        session.setAttribute("cart",map);

        request.getRequestDispatcher("/lookShoppingCart.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

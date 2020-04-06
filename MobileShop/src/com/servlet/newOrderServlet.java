package com.servlet;

import com.domain.Mobile;
import com.service.MobileService;
import com.service.impl.MobileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/newOrderServlet")
public class newOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        MobileService service = new MobileServiceImpl();
        HttpSession session = request.getSession();

        Map<Integer, Mobile> map =(Map<Integer,Mobile>) session.getAttribute("cart");
        String username = (String)session.getAttribute("username");

        double value = service.newOrder(username,map);

        session.setAttribute("order",map);
        session.setAttribute("orderValue",value);
        request.getRequestDispatcher("lookOrder.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/addToCartServlet")
public class addToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();

        Map<Integer,Mobile> map =(Map<Integer,Mobile>) session.getAttribute("cart");
        if(map == null) {
            map = new HashMap<Integer,Mobile>();
        }

        String mobile_version = request.getParameter("mobile_version");

        MobileService service = new MobileServiceImpl();
        Mobile mobile = service.findPhoneByVersion(mobile_version);

        int i = map.size();
        map.put(i+1,mobile);
        session.setAttribute("cart",map);

        request.getRequestDispatcher("/lookShoppingCart.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

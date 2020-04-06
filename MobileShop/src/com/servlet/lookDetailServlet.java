package com.servlet;

import com.domain.Mobile;
import com.service.MobileService;
import com.service.impl.MobileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lookDetailServlet")
public class lookDetailServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String mobile_version = request.getParameter("mobile_version");
        MobileService service = new MobileServiceImpl();
        Mobile mobile = service.findPhoneByVersion(mobile_version);
        System.out.println(mobile);

        request.setAttribute("mobile",mobile);

        request.getRequestDispatcher("/lookDetail.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

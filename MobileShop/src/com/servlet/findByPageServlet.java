package com.servlet;

import com.domain.Mobile;
import com.domain.PageBean;
import com.service.MobileService;
import com.service.impl.MobileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findByPageServlet")
public class findByPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String currentPage = request.getParameter("currentPage");//从前台获得当前页码
        String rows = request.getParameter("rows");//从前台获得每页显示条数
        String mobile_made = request.getParameter("mobile_made");

        if(currentPage == null||"".equals(currentPage)) {
            currentPage = "0";
        }
        if(rows == null||"".equals(rows)) {
            rows = "2";
        }
        if(mobile_made == null||"".equals(mobile_made)) {
            mobile_made = "%.%";
        }

        //调用service查询
        MobileService service = new MobileServiceImpl();
        PageBean<Mobile> pb = service.findPhoneByPage(currentPage,rows,mobile_made);

        //将pageBean放入request
        request.setAttribute("pb",pb);

        //转发到前台页面
        request.getRequestDispatcher("/lookByPage.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

package com.servlet;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.domain.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        UserDao dao = new UserDaoImpl();
        Map<String, String[]> map = request.getParameterMap();
        User user = new User();
            try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        if((!user.getLogname().equals(""))&&(!user.getPassword().equals(""))&&(!user.getAddress().equals(""))
                &&(!user.getPhone().equals(""))&&(!user.getRealname().equals(""))) {
            dao.register(user);
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }else{
            request.setAttribute("register_msg","请输入完整信息");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

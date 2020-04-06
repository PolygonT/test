package filter;

import com.domain.User;
import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class loginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //System.out.println("filter finished.");
        HttpServletRequest request = (HttpServletRequest) req;

        String requestURI = request.getRequestURI();
        //System.out.println(requestURI);

        if(requestURI.contains("/loginServlet") || requestURI.contains("/login.jsp") ||
                requestURI.contains("/index.jsp") || requestURI.contains("registerServlet") ||
                    requestURI.contains("register.jsp")) {
            chain.doFilter(req, resp);
        }
        else {
            Object user = request.getSession().getAttribute("username");
            if(user == null) {
                req.getRequestDispatcher("/mainPage_unLogin.jsp").forward(req,resp);
            }
            else {
                System.out.println("filter finished.");
                chain.doFilter(req, resp);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

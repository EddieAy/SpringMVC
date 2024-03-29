package zera.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getSession().getAttribute("username") == null){
            request.setAttribute("msg2","别想着没登录就看，请先登录");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return false;
        }
        return true;
    }
}

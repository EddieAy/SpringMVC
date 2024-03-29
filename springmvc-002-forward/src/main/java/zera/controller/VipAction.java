package zera.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VipAction {

    @RequestMapping("/vip.action")
    public String vip(HttpSession session){
        System.out.println(session.getAttribute("username"));
        System.out.println("带你去真正的vip");
        return "forward:/WEB-INF/vip.jsp";
    }

    @RequestMapping("/login.action")
    public String login(String username, String password, HttpServletRequest request){
        if(username.equals("admin") && password.equals("123")){
            request.getSession().setAttribute("username",username);
            System.out.println("带你去真正的vip");
            return "forward:/WEB-INF/vip.jsp";
        }else {
            request.setAttribute("msg","用户名 密码不正确");
            return "forward:/login.jsp";
        }
    }
}

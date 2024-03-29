package zera.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VipAction {

    @RequestMapping("/vip.action")
    public String vip(){
        System.out.println("带你去真正的vip");
        return "forward:/WEB-INF/vip.jsp";
    }

    @RequestMapping("/login.action")
    public String login(String username, String password, HttpServletRequest request){
        if(username.equals("admin") && password.equals("123")){
            request.setAttribute("username",username);
            return
        }
        System.out.println("带你去真正的vip");
        return "forward:/WEB-INF/vip.jsp";
    }
}

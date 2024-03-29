package zera.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import zera.pojo.User;

import java.util.Map;

@Controller
public class StartAction {

    @RequestMapping("/one.action")
    public String one(){
        System.out.println("转发 网页");
        return "hello";
    }
    @RequestMapping("/two.action")
    public String two(){
        System.out.println("转发 action");
        return "forward:/other.action";
    }
    @RequestMapping("/three.action")
    public String three(){
        System.out.println("重定向 网页");
        return "redirect:/admin/hello.jsp";
    }
    @RequestMapping("/four.action")
    public String four(){
        System.out.println("转发 网页");
        return "redirect:/other.action";
    }

    @RequestMapping("/five.action")
    public String five(){
        System.out.println("随便跳");
        return "forward:/fore/login.jsp";
    }

    @RequestMapping("/six.action")
    public String six(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                      HttpSession httpSession, Model model,
                      ModelMap modelMap, Map map){
        System.out.println("开始传递数据");
        User user = new User("Zeka",12);
        httpServletRequest.setAttribute("requestUser",user);
        httpSession.setAttribute("sessionUser",user);
        model.addAttribute("modelUser",user);
        map.put("mapUser",user);
        modelMap.put("modelMapUser",user);
        return "forward:/admin/hello.jsp";
    }
}

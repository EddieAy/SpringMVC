package zera.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondAction {


    @RequestMapping("/other.action")
    public String other(){
        System.out.println("这是在other action里面");
        return "hello";
    }


}

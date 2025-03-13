package data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SawonController {
//    @GetMapping({"/", "/sawonlist"})
//    public String list(){
//        return "sawon/sawonlist";
//    }
    @GetMapping("/")
    public String list(){
        return "sawon/sawonlist";
    }
}

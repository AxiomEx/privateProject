package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnnounceController {
    
    @GetMapping("/announce") 
    public String announce(){
        return "/announce";
    }
    
    

}

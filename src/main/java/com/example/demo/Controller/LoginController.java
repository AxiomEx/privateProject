package com.example.demo.Controller;

import javax.servlet.annotation.WebFilter;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@WebFilter(asyncSupported = true)
@Controller
public class LoginController {
    
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
    @GetMapping("/login")
    
	public String login() {
        System.out.println("타니???");
		return "login";
	}
	
	// @PostMapping("/login")
	// public String loginProcess(){
		
	// }

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// @RequestMapping(value = "/loginProcess.do", method = RequestMethod.POST)
	// public String loginProcess(@RequestParam String id, HttpServletRequest request) {
		
	// 	System.out.println("세션 받기 전");
		
    // 	HttpSession session = request.getSession();
    // 	session.setAttribute("id", id);

    //     System.out.println("세션 받은 후");
	// 	return "chat";
	// }
	
}

package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.MemberDTO;
import com.example.demo.Service.MemberService;

@Controller
public class MemberController {
    
    @Autowired
    private MemberService memberservice;

//    @Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/regist")
    public String registProcess(MemberDTO dto){
    	System.out.println("post");
        // dto.setM_pw(bCryptPasswordEncoder.encode(dto.getM_pw()));
        memberservice.memberInsert(dto);
        System.out.println(dto.toString());

        return "index";
    }

    

}

package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.MemberDTO;
import com.example.demo.Service.MemberService;

public class MemberController {
    
    @Autowired
    private MemberService memberservice;

//    @Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/Regist")
	public String regist(){
		return "/Regist";
	}

    @PostMapping("/Regist")
    public String registProcess(MemberDTO dto){
    	
        // dto.setM_pw(bCryptPasswordEncoder.encode(dto.getM_pw()));
        memberservice.memberInsert(dto);
        System.out.println(dto.toString());
        return "/index";
    }

    

}

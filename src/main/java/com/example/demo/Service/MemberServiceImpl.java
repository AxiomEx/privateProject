package com.example.demo.Service;

import com.example.demo.Model.MemberDTO;
import com.example.demo.mapper.MemberMapper;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberServiceImpl implements MemberService{
    
    @Autowired
    private MemberMapper mapper;
    
    @Override
    public void memberInsert(MemberDTO dto){
        mapper.memberInsert(dto);
    }

}

package com.example.demo.mapper;

import com.example.demo.Model.MemberDTO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    
    public void memberInsert(MemberDTO dto);

}

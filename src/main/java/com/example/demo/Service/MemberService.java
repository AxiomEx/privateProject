package com.example.demo.Service;

import com.example.demo.Model.MemberDTO;


public interface MemberService {
    
    void memberInsert(MemberDTO dto);

	int login(MemberDTO dto);

	MemberDTO memberRead(String m_id);

}

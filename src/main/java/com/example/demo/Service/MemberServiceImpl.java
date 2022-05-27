package com.example.demo.Service;

import com.example.demo.Model.MemberDTO;
import com.example.demo.mapper.MemberMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
    
    @Autowired
    private MemberMapper mapper;
    
    @Override
    public void memberInsert(MemberDTO dto){
        mapper.memberInsert(dto);
    }

	@Override
	public int login(MemberDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDTO memberRead(String m_id) {
		// TODO Auto-generated method stub
		return null;
	}

}

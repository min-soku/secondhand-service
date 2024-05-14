package com.secondhand.dao;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.secondhand.domain.MemberDTO;

public interface MemberDAO {
	
	public MemberDTO save(MemberDTO member);
	public MemberDTO findByMbrId(String loginId);
	public List<MemberDTO> findAll();
	public void clearStore();
	// 회원 탈퇴 (삭제 되면 true 반환)
	public boolean delete(MemberDTO member); 
	//로그인한 사용자의 찜 여부 가져오기
	public List<String> getBMK(String mbrId);
	//찜 추가 및 삭제
	public void updateBMK(Map<String, Object> param);
}

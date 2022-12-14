package com.wondumall.Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.wondumall.DAO.LoginDAO;
import com.wondumall.DTO.LoginDTO;

@Service
public class LoginService {
	@Autowired
	private LoginDAO loginDAO;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public LoginDTO login(LoginDTO dto) {
		return loginDAO.login(dto);
	}

	public int join(LoginDTO dto) {
		dto.setU_pw(passwordEncoder.encode(dto.getU_pw()));
		return loginDAO.join(dto);
	}

	public int emailCheck(String email) {
		return loginDAO.emailCheck(email);
	}

	public int nicknameCheck(String nickname) {
		return loginDAO.nicknameCheck(nickname);
	}

	public int gradeCheck(String grade) {
		return loginDAO.gradeCheck(grade);
	}
	public int update(LoginDTO dto) {
		return loginDAO.update(dto);
	}

	public int snsInfoUpdate(LoginDTO loginDTO) {
		return loginDAO.snsInfoUpdate(loginDTO);
	}

	public ModelAndView mypage(LoginDTO dto) {
		return loginDAO.mypage(dto);
		
	}

	public void resign(int u_no) {
		loginDAO.resign(u_no);
		
	}

	public int changepw(LoginDTO user) {
		user.setU_pw(passwordEncoder.encode(user.getU_pw()));
		return loginDAO.changepw(user);
	}

	public boolean checkpw(int u_no, String u_pw) {
		String pw = loginDAO.checkpw(u_no);
		if(passwordEncoder.matches(u_pw, pw)) {
			return true;
		} else {
			return false;
		}
	}

	public int contain(LoginDTO user) {
		return loginDAO.contain(user);
	}

	public int resetpw(LoginDTO user) {
		user.setU_pw(passwordEncoder.encode(user.getU_pw()));
		return loginDAO.resetpw(user);
		
	}


	public String findid(Map<String, Object> map) {
		return loginDAO.findid(map);
	}

		
		
	
	
	

}

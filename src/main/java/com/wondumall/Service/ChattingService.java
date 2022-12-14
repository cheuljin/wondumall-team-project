package com.wondumall.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wondumall.DAO.ChattingDAO;
import com.wondumall.DTO.ChatDTO;
import com.wondumall.DTO.LoginDTO;

@Service
public class ChattingService {
	@Autowired ChattingDAO chattingDAO;

	public List<LoginDTO> getAdminList(Map<String, Object> data) {
		return chattingDAO.getAdminList(data);
	}

	public List<LoginDTO> getRoomList(Map<String, Object> data) {
		return chattingDAO.getRoomList(data);
	}

	public List<ChatDTO> getChattingList(Map<String, Object> data) {
		return chattingDAO.getChattingList(data);
	}

	public int containRoom(Map<String, Object> data) {
		return chattingDAO.containRoom(data);
	}

	public void createRoom(Map<String, Object> data) {
		chattingDAO.createRoom(data);
	}

	public int addChatting(Map<String, Object> map) {
		return chattingDAO.addChatting(map);
	}

	public int getAdminNo(String receive) {
		return chattingDAO.getAdminNo(receive);
	}

	public void setRoomCountMinus(Map<String, Object> map) {
		chattingDAO.setRoomCountMinus(map);
	}

	public void setRoomCountPlus(Map<String, Object> map) {
		chattingDAO.setRoomCountPlus(map);		
	}

	public void resetRoomCountPlus(Map<String, Object> map) {
		chattingDAO.resetRoomCountPlus(map);
	}

	public void resetRoomCountMinus(Map<String, Object> map) {
		chattingDAO.resetRoomCountMinus(map);
	}
}

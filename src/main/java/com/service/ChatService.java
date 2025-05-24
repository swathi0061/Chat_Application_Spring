package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dto.Message;
import com.dto.MessageProjection;
import com.dto.User;
import com.repository.MessageRepository;
import com.repository.UserRepository;

@Service
public class ChatService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private MessageRepository messageRepository;

	 @Transactional
	    public String registerUser(String username, String password) {
	        return userRepository.registerUser(username, password);
	    }

	public void sendMessage(Long senderId, Long receiverId, String message) {
		messageRepository.sendMessage(senderId, receiverId, message);
	}

	public List<MessageProjection> getChatHistory(Long senderId, Long receiverId) {
		System.out.println("user1"+senderId+"__"+receiverId);
		return messageRepository.getChatHistory(senderId, receiverId);
	}
}

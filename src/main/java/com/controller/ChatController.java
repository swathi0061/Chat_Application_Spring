package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Message;
import com.dto.MessageProjection;
import com.service.ChatService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/chat")
public class ChatController {

	@Autowired
	private ChatService chatService;

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestParam String username, @RequestParam String password) {
		String dbMessage =  chatService.registerUser(username, password);
		System.out.println(username+"--"+password);
		return ResponseEntity.ok(dbMessage);
	}

	@PostMapping("/send")
	public ResponseEntity<String> sendMessage(@RequestParam Long senderId, @RequestParam Long receiverId,
			@RequestParam String message) {
		chatService.sendMessage(senderId, receiverId, message);
		return ResponseEntity.ok("Message Sent Successfully!");
	}

	@GetMapping("/history")
	public ResponseEntity<List<MessageProjection>> getChatHistory(@RequestParam Long senderId, @RequestParam Long receiverId) {
		System.out.println("user1"+senderId);
		return ResponseEntity.ok(chatService.getChatHistory(senderId,receiverId));
	}

}

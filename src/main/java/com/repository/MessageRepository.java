package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dto.Message;
import com.dto.MessageProjection;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

	    @Procedure(name = "SendMessage")
	    void sendMessage(@Param("p_sender_id") Long senderId,
	                     @Param("p_receiver_id") Long receiverId,
	                     @Param("p_message") String message);

	    @Query(value = "CALL getChatHistory(:p_user1, :p_user2)", nativeQuery = true)
	    List<MessageProjection> getChatHistory(@Param("p_user1") Long senderId,
	                                 @Param("p_user2") Long receiverId);

	    
}

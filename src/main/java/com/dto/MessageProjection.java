package com.dto;

import java.security.Timestamp;
import java.util.Date;


public interface MessageProjection {
	 Long getId();
	 Long getSender_id();     // Match the column name in the database: sender_id
	 Long getReceiver_id();   // Match the column name in the database: receiver_id
	 String getMessage();
	 Date getTimestamp();
}

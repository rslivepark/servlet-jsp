package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MessageVO {
	
	
	private int num;
	private String sender;
	private String recipient;
	private String message;
	private String m_date;
	
	
}

/**
 * 
 */
package com.ocko.stomp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ok
 * 채팅 메시지 객체
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
	
	public enum MessageType {
        ENTER, TALK
    }

    private MessageType type;
    // 채팅방 ID
    private String roomId;
    // 보내는 사람
    private String sender;
    // 내용
    private String message;
}

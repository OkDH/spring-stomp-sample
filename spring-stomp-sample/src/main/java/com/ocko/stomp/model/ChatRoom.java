/**
 * 
 */
package com.ocko.stomp.model;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ok
 * 채팅방 객체
 */
@Getter
@Setter
@NoArgsConstructor
public class ChatRoom {

	private String roomId;
    private String roomName;


    public static ChatRoom create(String name) {
        ChatRoom room = new ChatRoom();
        room.roomId = UUID.randomUUID().toString();
        room.roomName = name;
        return room;
    }
    
}

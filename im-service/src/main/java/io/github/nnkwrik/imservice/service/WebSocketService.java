package io.github.nnkwrik.imservice.service;

/**

 */
public interface WebSocketService {

    int getUnreadCount(String userId);

    void OnMessage(String senderId, String message);

}

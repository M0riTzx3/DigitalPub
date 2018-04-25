package de.digitalpub.webChat;

import javax.jms.Message;
import javax.websocket.OnMessage;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/chat/{username}")
public class ChatEndpoint {

    @OnOpen
    public void onOpen(Session session) throws IOException {
        // Get session and WebSocket connection
    }

    @OnMessage
    public void onMessage(){

    }

    @OnClose
    public void onClose(Session session) throws IOException {
        // WebSocket connection closes
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        // Do error handling here
    }
}
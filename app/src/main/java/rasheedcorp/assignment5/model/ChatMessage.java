package rasheedcorp.assignment5.model;


import java.util.Date;

public class ChatMessage {
    private String messageText;
    private String messageUser;
    private String messageTime;
    private String photoUrl;


    public ChatMessage(){

    }
    public ChatMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;
    }

    public ChatMessage(String messageText, String messageUser, String messageTime) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.messageTime = messageTime;
    }

    public ChatMessage(String messageText, String messageUser, String messageTime, String photoUri) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.messageTime = messageTime;
        this.photoUrl = photoUri;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }
    public String getUri() {
        return photoUrl;
    }

    public String getMessageTime() {
        return messageTime;
    }


    public void setMessageUser (String messageUser) {
        this.messageUser = messageUser;
    }
}




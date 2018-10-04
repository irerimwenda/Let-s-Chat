package com.example.ireribrian.firebasechatapp.models;

/**
 * Created by ireribrian on 10/4/2018.
 */

public class Users {

    private String emailId;
    private String lastMessage;
    private int notifCount;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public int getNotifCount() {
        return notifCount;
    }

    public void setNotifCount(int notifCount) {
        this.notifCount = notifCount;
    }
}

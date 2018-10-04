package com.example.ireribrian.firebasechatapp.models;

/**
 * Created by ireribrian on 10/4/2018.
 */

public class User {

    public String uid;
    public String email;
    public String firebaseToken;

    public User(){

    }

    public User(String uid, String email, String firebaseToken){
        this.uid = uid;
        this.email = email;
        this.firebaseToken = firebaseToken;
    }
}

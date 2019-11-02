package com.example.login;

import android.widget.EditText;

public class User {
    public String inputName;
    public int phoneNumber;
    public String email;

    // Default constructor required for calls  to DataSnapshot.getValue(User.class)
    public User() { }

    public User(String inputName, int phoneNumber, String email) {
       this.inputName = inputName;
       this.phoneNumber = phoneNumber;
       this.email = email;
    }


}

package com.tutorials180.bscsbadapterapp.ModelClasses;

public class ContactModel {

    private String nameOfUser;
    private String emailOfUser;

    private int linkToAvatar;

    public ContactModel(String nameOfUser, String emailOfUser, int linkToAvatar) {
        this.nameOfUser = nameOfUser;
        this.emailOfUser = emailOfUser;
        this.linkToAvatar = linkToAvatar;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public String getEmailOfUser() {
        return emailOfUser;
    }

    public int getLinkToAvatar() {
        return linkToAvatar;
    }
}

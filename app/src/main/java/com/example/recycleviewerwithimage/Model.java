package com.example.recycleviewerwithimage;

public class Model {

    private int id;
    private byte [] proavatar;
    private String username;

    //constructor

    public Model(int id, byte[] proavatar, String username) {
        this.id = id;
        this.proavatar = proavatar;
        this.username = username;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getProavatar() {
        return proavatar;
    }

    public void setProavatar(byte[] proavatar) {
        this.proavatar = proavatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}

package edu.eci.ieti.model;

public class User {
    private String name;
    private String email;
    private String id;
    private String password;

    public User(String id,String name,String email,String password){

        this.id = id;
        this.name =name;
        this.email = email;
        this.password =password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.hunglt.FirstProjectSpringWebFlux.Model;

public class Greeting {
    private String message;

    public Greeting(){};

    public Greeting(String message){
        this.message = message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public String toString(){
        return "The value of this object is : " + this.getMessage();
    }
}

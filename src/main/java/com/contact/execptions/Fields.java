package com.contact.execptions;

public class Fields {
    private String name;
    private String message;
    public Fields(String name, String message) {
        super();
        this.name = name;
        this.message = message;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}

package com.example;

public abstract class Persona {

    private String name;
    private String identifier;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    public Persona(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    
    
}

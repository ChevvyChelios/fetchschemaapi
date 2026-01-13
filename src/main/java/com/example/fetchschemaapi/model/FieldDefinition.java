package com.example.fetchschemaapi.model;

public class FieldDefinition {

    private String key;
    private String label;
    private String type;
    private boolean required;

    public FieldDefinition() {}

    // getters & setters
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isRequired() {
        return required;
    }
    public void setRequired(boolean required) {
        this.required = required;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
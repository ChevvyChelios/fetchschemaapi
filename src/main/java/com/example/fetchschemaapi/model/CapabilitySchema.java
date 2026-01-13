package com.example.fetchschemaapi.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "capability_schemas")
public class CapabilitySchema {

    @Id
    private String id;

    private String capabilitySchema;
    private String productName;
    private String version;
    private List<FieldDefinition> fields;

    // getters & setters
    public String getId() {
        return id;
    }

    public String getCapabilitySchema() {
        return capabilitySchema;
    }

    public void setCapabilitySchema(String capabilitySchema) {
        this.capabilitySchema = capabilitySchema;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<FieldDefinition> getFields() {
        return fields;
    }

    public void setFields(List<FieldDefinition> fields) {
        this.fields = fields;
    }
    
}

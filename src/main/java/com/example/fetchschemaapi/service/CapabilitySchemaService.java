package com.example.fetchschemaapi.service;

import org.springframework.stereotype.Service;

import com.example.fetchschemaapi.model.CapabilitySchema;
import com.example.fetchschemaapi.repository.CapabilitySchemaRepository;

@Service
public class CapabilitySchemaService {

    private final CapabilitySchemaRepository repository;
    public CapabilitySchemaService(CapabilitySchemaRepository repository) {
        this.repository = repository;
    }

    public CapabilitySchema getSchema(String productName, String version) {
        return repository.findByProductName(productName)
                .orElseThrow(() -> new RuntimeException("Schema not found for product: " + productName));
    }

    public CapabilitySchema saveSchema(CapabilitySchema schema) {
        return repository.save(schema);
    }

}

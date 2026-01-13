package com.example.fetchschemaapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fetchschemaapi.model.CapabilitySchema;
import com.example.fetchschemaapi.service.CapabilitySchemaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/schema")
public class CapabilitySchemaController {
    
    private final CapabilitySchemaService service;

    public CapabilitySchemaController(CapabilitySchemaService service) {
        this.service = service;
    }

    // Create schema (for testing/admin use)
    @PostMapping()
    public ResponseEntity<CapabilitySchema> createSchema(
        @RequestBody CapabilitySchema schema
    ) { 
        return ResponseEntity.ok(service.saveSchema(schema));
    }

    // Fetch schema by product name
    @GetMapping("/{productName}")
    public ResponseEntity<CapabilitySchema> getSchema(@PathVariable String productName) {
        return ResponseEntity.ok(service.getSchema(productName, ""));
    }
    
}

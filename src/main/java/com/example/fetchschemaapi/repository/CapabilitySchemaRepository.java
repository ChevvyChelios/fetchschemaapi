package com.example.fetchschemaapi.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.fetchschemaapi.model.CapabilitySchema;

public interface CapabilitySchemaRepository
        extends MongoRepository<CapabilitySchema, String> {

    Optional<CapabilitySchema> findByProductName(String productName);
}
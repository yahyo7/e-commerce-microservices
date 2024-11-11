package com.sharipov.productcatalogservice.domain.exeption;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

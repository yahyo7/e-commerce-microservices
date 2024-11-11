package com.sharipov.productcatalogservice.domain.exeption;

public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound(String message) {
        super(message);
    }
}

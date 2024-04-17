package dev.Ningappa.EcommProductService.exception;

public class ProductNotFoundException extends Throwable {


    public ProductNotFoundException() {
    }

    public ProductNotFoundException(String message) {
        super(message);
    }
}

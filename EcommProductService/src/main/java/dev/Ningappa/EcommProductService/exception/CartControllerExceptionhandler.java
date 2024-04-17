package dev.Ningappa.EcommProductService.exception;


import dev.Ningappa.EcommProductService.controller.CartController;
import dev.Ningappa.EcommProductService.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackageClasses = CartController.class)
public class CartControllerExceptionhandler
{
    @ExceptionHandler(CartNotFoundException.class)
    public ResponseEntity handleCartNotFoundException(CartNotFoundException pe)
    {
        ExceptionResponseDTO exceptionResponseDTO=new ExceptionResponseDTO(
                pe.getMessage(),
                404

        );

        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }
}

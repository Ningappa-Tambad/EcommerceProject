package dev.Ningappa.EcommProductService.exception;

import dev.Ningappa.EcommProductService.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class ProductServicerExceptionHandler {


    @ExceptionHandler(NoProductPresentException.class)
    public ResponseEntity handleNoProductPresentException(NoProductPresentException pe)
    {
        ExceptionResponseDTO exceptionResponseDTO=new ExceptionResponseDTO(
                pe.getMessage(),
                404

        );

        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity handleProductNotFoundException(ProductNotFoundException pe)
    {
        ExceptionResponseDTO exceptionResponseDTO=new ExceptionResponseDTO(
                pe.getMessage(),
               404

        );

        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }
}

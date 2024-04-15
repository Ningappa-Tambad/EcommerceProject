package dev.Ningappa.EcommProductService.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponseDTO {

    private String message;
    private int code; //Error code

    public ExceptionResponseDTO(String message, int code) {
        this.message = message;
        this.code = code;
    }


}

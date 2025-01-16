package com.example.FOROHUBFINAL;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

public class ControllerAdvice   {

    import org.springframework.http.ResponseEntity;


    @RestControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(RuntimeException.class)
        public ResponseEntity<String> manejarErrores(RuntimeException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

}

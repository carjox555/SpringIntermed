package com.project.cochesIntermed.exception;

public class EmailValidationException extends  RuntimeException{
    public EmailValidationException(){
        super("El email no tiene el format required");
    }
}

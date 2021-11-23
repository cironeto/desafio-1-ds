package dev.cironeto.desafio1ds.service.exception;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String message){
        super(message);
    }
}

package br.com.go.marketplace.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msgExcep) {
        super(msgExcep);
    }

    public ObjectNotFoundException(String msgExcep, Throwable cause) {
        super(msgExcep, cause);
    }

}

package com.projeto.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1l;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}

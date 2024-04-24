package tech.nocountry.c1751njava.petadoption.exception.custom;

import lombok.Getter;

@Getter
public class ValidationError extends RuntimeException {
    private String fieldName;
    private String message;

    public ValidationError(String fieldName, String message) {
        super(message);
        this.fieldName = fieldName;
        this.message = message;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

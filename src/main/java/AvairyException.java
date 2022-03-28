package main.java;

public class AvairyException extends Exception{
    public AvairyException() {
    }

    public AvairyException(String message) {
        super(message);
    }

    public AvairyException(String message, Throwable cause) {
        super(message, cause);
    }

    public AvairyException(Throwable cause) {
        super(cause);
    }

    public AvairyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

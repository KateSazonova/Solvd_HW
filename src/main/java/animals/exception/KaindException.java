package animals.exception;

public class KaindException extends Exception {
    public KaindException() {
    }

    public KaindException(String message) {
        super(message);
    }

    public KaindException(String message, Throwable cause) {
        super(message, cause);
    }

    public KaindException(Throwable cause) {
        super(cause);
    }

    public KaindException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

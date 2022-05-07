package il.ac.hit.pooly;

public class ThreadsPoolException extends Exception {
    public ThreadsPoolException(String message) {
        super(message);
    }

    public ThreadsPoolException(String message, Throwable cause) {
        super(message, cause);
    }
}

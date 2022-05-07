package il.ac.hit.pooly;

/**
 * Errors Department, which handles errors related to priority management.
 */
public class ThreadsPoolException extends Exception {

    public ThreadsPoolException(String message) {
        super(message);
    }

    public ThreadsPoolException(String message, Throwable cause) {
        super(message, cause);
    }
}

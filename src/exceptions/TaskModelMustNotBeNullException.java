package exceptions;

public class TaskModelMustNotBeNullException extends RuntimeException {
    public TaskModelMustNotBeNullException(String message) {
        super(message);
    }
}

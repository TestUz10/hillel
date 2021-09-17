package hanna_aleksieitseva.hw15_exceptions_and_enum.task1;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }
}
package hanna_aleksieitseva.hw15_exceptions_and_enum.task1;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super(message);
    }
}

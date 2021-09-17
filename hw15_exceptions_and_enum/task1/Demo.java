package hanna_aleksieitseva.hw15_exceptions_and_enum.task1;

import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Login with incorrect email result = " + login("fre@gmail.com", "345678", "345678"));
        System.out.println();
        System.out.println("Login with incorrect password result = " + login("fre_gmail_com", "!@#", "!@#"));
        System.out.println();
        System.out.println("Login with not the same passwords result = " + login("fre_gmail_com", "345678", "4567m/"));
        System.out.println();
        System.out.println("Login with correct details result = " + login("fre_gmail_com", "345678", "345678"));
    }

    public static boolean login(String email, String password, String confirmPassword) {
        try {
            validateEmail(email);
            validatePassword(password);
            validatePasswordsEqual(password, confirmPassword);
            return true;
        } catch (Exception e) {
            System.out.println("Caught "+e.getMessage());
            return false;
        }
    }

    private static void validatePasswordsEqual(String password, String confirmPassword) throws Exception {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords are not the same");
        }
    }

    private static void validatePassword(String password) throws WrongPasswordException {
        if (!Pattern.compile("^[a-zA-Z0-9-._]+$").matcher(password).matches()) {
            throw new WrongPasswordException("Incorrect Password");
        }
    }

    private static void validateEmail(String email) throws WrongLoginException {
        if (!Pattern.compile("^[a-zA-Z0-9-._]+$").matcher(email).matches()) {
            throw new WrongLoginException("Incorrect email");
        }
    }
}
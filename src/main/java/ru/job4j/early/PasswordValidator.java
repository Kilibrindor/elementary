package ru.job4j.early;

public class PasswordValidator {

    private static boolean isUpperCase = false;
    private static boolean isLowerCase = false;
    private static boolean isNumeric = false;
    private static boolean isSpecial = false;

    private static void validation(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c) && Character.isLetter(c)) {
                isUpperCase = true;
            }
            if (Character.isDigit(c)) {
                isNumeric = true;
            }
            if (Character.isLowerCase(c)) {
                isLowerCase = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                isSpecial = true;
            }
        }
    }

    private static void validateOfWeakPass(String password) {
        String[] passwords = {"qwerty", "12345", "password", "admin", "user"};
        for (String s : passwords) {
            if (password.toLowerCase().contains(s)) {
                throw new IllegalArgumentException(
                        "Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
    }

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        validateOfWeakPass(password);
        validation(password);
        if (!isLowerCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!isNumeric) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!isSpecial) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (!isUpperCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        return password;
    }
}

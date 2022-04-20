package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User u : users) {
            if (login.equals(u.getUsername())) {
                user = u;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean valid = user.isValid() && user.getUsername().length() >= 3;
        if (!valid) {
            throw new UserInvalidException("Пользователь не валидный");
        }
        return valid;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("A", true)
        };
        try {
            User user = findUser(users, "A");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException u) {
            u.printStackTrace();
        }

    }
}

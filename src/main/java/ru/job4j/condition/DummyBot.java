package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String result = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет бот".equalsIgnoreCase(question)) {
            result = "Привет умник.";
        } else if ("Пока".equalsIgnoreCase(question)) {
            result = "До скорой встречи.";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(DummyBot.answer("Пока"));
        System.out.println(DummyBot.answer("ку - ку"));
    }
}

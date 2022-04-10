package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book = new Book("Clean code", 20);
        Book book1 = new Book("Warcraft", 200);
        Book book2 = new Book("Clean code", 200);
        Book book3 = new Book("Warhammer", 300);
        Book[] books = {book, book1, book2, book3};

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages());
        }
        System.out.println();
        books[0] = book3;
        books[3] = book;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages());
        }
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " " + books[i].getPages());
            }
        }
    }
}

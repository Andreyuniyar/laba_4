package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Book book = new Book(8, 9, "Алан тьюринг", "Игра в иммитацию");
        // // Book book_copy = book.clone();
        // System.out.println(book);
        // Reader andrey = new Reader(book, "Andrey");
        // System.out.println(andrey.in_time(8, 9));

        Scanner sc = new Scanner(System.in);

        System.out.printf("Введите имя читателя: ");
        String reader_in = sc.nextLine();
        System.out.printf("Введите имя автора: ");
        String author = sc.nextLine();
        System.out.printf("Введите название киги: ");
        String title = sc.nextLine();
        System.out.printf("Введите день сдачи: ");
        int day_end = sc.nextInt();
        System.out.printf("Введите месяц сдачи: ");
        int month_end = sc.nextInt();

        Book book = new Book(day_end, month_end, author, title);
        Reader reader = new Reader(book, reader_in);
        System.out.println(reader.in_time(8, 9));

    }
}

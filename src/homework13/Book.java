package homework13;

import java.util.Scanner;

public class Book {
    private String name;
    private Author author;
    private int year;
    private Book book;

    public Book () {
        name = "имя книги";
        author = new Author();
        year = 1999;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author.getAuthor();
    }
    public int getYear() {
        return year;
    }
    public int setYear (int y) {
        this.year = y;
        return this.year;
    }
    public Book writeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        name = scanner.nextLine();
        author.writeAuthor();

        System.out.println("Введите год издания книги");
        year = scanner.nextInt();
        return this;
    }
    public void printBook() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Название " + name + author.toString() + " Год " + year;
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return toString().equals(b2.toString());
    }
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}


package GShildt.Chapter_8.bookpackext;

import GShildt.Chapter_8.bookpkg.Book;

public class UseBook {
    public static void main(String[] args) {
        Book books[] = new Book[5];

        books[0] = new Book("Java8", "Shildt", 2015);
        books[1] = new Book("Java9", "Gomer", 2016);
        books[2] = new Book("Java10", "Named", 2017);
        books[3] = new Book("Java11", "Fhmed", 2018);
        books[4] = new Book("Java12", "Roma2", 2019);


        for (int i = 0; i < 5; i++) {
            books[i].toShow();
        }
    }
}

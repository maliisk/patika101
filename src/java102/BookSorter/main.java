package java102.BookSorter;

import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();

        Book b1 = new Book("Anna Karanina I", 823, "aut1", "1812");
        Book b2 = new Book("Anna Karanina II", 912, "aut2", "1822");
        Book b3 = new Book("Sefiller", 1452, "aut3", "1862");
        Book b4 = new Book("Aşk-ı Memnu", 1672, "aut4", "1934");
        Book b5 = new Book("Suç ve Ceza", 546, "aut5", "1863");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);


        System.out.println("ORDER BY NAME:");

        for (Book bookName : books) {
            System.out.println("Book Name: " + bookName.getBookName() +
                    "\nNumber of page: " + bookName.getPageNumber() +
                    "\nAuthor Name: " + bookName.getAuthorName() +
                    "\nReleased Date: " + bookName.getPublishDate());
            System.out.println("********************************");
        }
        System.out.println(" ");
        TreeSet<Book> books1 = new TreeSet<>(new OrderPageNumber());

        books1.add(b1);
        books1.add(b2);
        books1.add(b3);
        books1.add(b4);
        books1.add(b5);



        System.out.println("ORDER BY PAGE:");

        for (Book pageNumber : books1) {
            System.out.println("Book Name: " + pageNumber.getBookName() +
                    "\nNumber of page: " + pageNumber.getPageNumber() +
                    "\nAuthor Name: " + pageNumber.getAuthorName() +
                    "\nReleased Date: " + pageNumber.getPublishDate());
            System.out.println("*******************************");
        }
    }
}
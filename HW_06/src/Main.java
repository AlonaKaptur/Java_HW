import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Books library = new Books(10);
        library.addBook(new Book(1, "Effective java", "Jame D Grizz", "KyivBook", 2017, 218, 172));
        library.addBook(new Book(1, "Java 8 in practice", "John Doe", "KyivBook", 2012, 347, 412));
        library.addBook(new Book(1, "Java 11 in practice", "John Doe", "KyivBook", 2018, 732, 534));
        library.addBook(new Book(1, "How to lean java during two hours", "Alona Kaptur", "HomePrint", 2019, 712, 500));

        library.printBooks();

        System.out.println("Please input author:");
        String author = inputString();
        for (Book book : library.findByAuthor(author)) {
            book.view();
        }
        System.out.println("Please input year:");
        int year = input();
        for (Book book : library.findByYearFrom(year)) {
            book.view();
        }

        System.out.println("Please input percent:");
        int percent = input();
        library.changePrice(percent);
        library.printBooks();

    }

    private static String inputString() {
        return sc.nextLine();
    }

    private static int input() {
        return sc.nextInt();
    }


}

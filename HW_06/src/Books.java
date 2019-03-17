public class Books {
    private Book[] library;
    private int capacity;

    public Books() {
    }

    public Books(int librarySize) {
        library = new Book[librarySize];
    }

    public Book[] getLibrary() {
        return library;
    }

    public void setLibrary(Book[] library) {
        this.library = library;
    }

    public void addBook(Book book) {
        if (capacity == library.length) {
            System.out.println("Library is full");
        } else {
            library[capacity] = book;
            capacity++;
        }
    }

    public void printBooks() {
        System.out.println("!!!");
        for (int i = 0; i < capacity; i++) {
            library[i].view();
        }
    }

    public void changePrice(int percent) {
        for (int i = 0; i < capacity; i++) {
            library[i].changePrice(percent);
        }
    }

    public Book[] findByAuthor(String author) {
        int authors = count(author);
        int counter = 0;
        Book[] result = new Book[authors];
        for (int i = 0; i < capacity; i++) {
            if (library[i].getAuthor().equals(author)) {
                result[counter] = library[i];
                counter++;
            }
        }
        return result;
    }

    public Book[] findByYearFrom(int year) {
        int authors = count(year);
        int counter = 0;
        Book[] result = new Book[authors];
        for (int i = 0; i < capacity; i++) {
            if (library[i].getYear() > year) {
                result[counter] = library[i];
                counter++;
            }
        }
        return result;
    }

    private int count(String author) {
        int counter = 0;
        for (int i = 0; i < capacity; i++) {
            if (library[i].getAuthor().equals(author)) {
                counter++;
            }
        }
        return counter;
    }

    private int count(int year) {
        int counter = 0;
        for (int i = 0; i < capacity; i++) {
            if (library[i].getYear() > year) {
                counter++;
            }
        }
        return counter;
    }
}

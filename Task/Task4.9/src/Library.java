public class Library {
    private Book[] booksArray;

    public Library() {
        booksArray = new Book[]{new Book(2999, 666, 69.42, "Nice", "World",
                "Oen", "Soft"),

                new Book(2023, 420, 69, "Name", "V", "Two",
                        "Soft"),

        };
    }

    public void findByAuthor(String authors) {
        boolean flag = false;

        for (Book book : booksArray) {
            if (book.getAuthors().equalsIgnoreCase(authors)) {
                System.out.println(book);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Couldn't find...");
        }
    }

    public void findByPublishHouse(String publishHouse) {
        boolean flag = false;

        for (Book book : booksArray) {
            if (book.getPublishHouse().equalsIgnoreCase(publishHouse)) {
                System.out.println(book);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Couldn't find...");
        }
    }

    public void findByPublishYear(int year) {
        boolean flag = false;

        for (Book book : booksArray) {
            if (book.getPublishYear() > year) {
                System.out.println(book);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Couldn't find...");
        }
    }

    public void view () {
        for (Book book : booksArray) {
            System.out.println(book);
        }
    }
}

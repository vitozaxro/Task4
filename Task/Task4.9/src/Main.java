public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        System.out.println("\nAll books:");
        library.view();

        String authorName = "Pine";

        System.out.println("\nBook(s), written by " + authorName + ":");
        library.findByAuthor(authorName);

        String publishHouseName = "Eleven";

        System.out.println("\nBook(s), published by " + publishHouseName + ":");
        library.findByPublishHouse(publishHouseName);

        int year = 2000;

        System.out.println("\nBook(s), published after " + year + ":");
        library.findByPublishYear(year);
    }
}
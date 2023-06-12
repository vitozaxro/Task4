public class Main {
    public static void main(String[] args) {
        int[] goodMarksArray = {10, 10, 10, 8, 10};
        int[] badMarksArray = {5, 4, 6, 3, 2};

        Student[] studentsArray = {
                new Student("Vito V.V.", 1, goodMarksArray),
                new Student("Luka L.L.", 2, goodMarksArray),
                new Student("Ilia I.I.", 1, badMarksArray),
                new Student("Sandro S.S.", 2, goodMarksArray),
                new Student("Merab M.M.", 3, badMarksArray),
                new Student("Nika N.N.", 3, badMarksArray),
                new Student("Gio G.G.", 4, badMarksArray),

        };

        System.out.println("\nAll students: ");
        Student.viewAllStudents(studentsArray);

        System.out.println("\nGood students:");
        Student.viewExcellentStudents(studentsArray);
    }
}
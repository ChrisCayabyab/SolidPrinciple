public class Tester{
    public static void main(String[] args){
        Student cayabyab = new Student("21-12575-796", "Chris Daniel");

        ResourceJournal journal = new ResourceJournal("978-0-553-29337-9", "To Kill a Mockingbird", "Harper Lee");
        ResourceBook book = new ResourceBook("0032-1478", "Nature", "Emily White");

        BorrowResource borrowBook = new BorrowBook();
        BorrowResource borrowJournal = new BorrowJournal();

        borrowBook.borrowResource(cayabyab, book);
        borrowJournal.borrowResource(cayabyab, journal);
    }
}
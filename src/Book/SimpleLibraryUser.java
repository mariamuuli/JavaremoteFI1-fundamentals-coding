package Book;

public class SimpleLibraryUser implements LibraryUser{
    private String Author;
    private String Title;

    @Override
    public void borrowBook(SimpleBook book2) {

        System.out.println("You borrowed a book. The author is " );
        book2.displayDetails();

    }

    @Override
    public void returnBook(SimpleBook book2) {
        System.out.println("You borrowed a book. The author is " );
        book2.displayDetails();

    }
}

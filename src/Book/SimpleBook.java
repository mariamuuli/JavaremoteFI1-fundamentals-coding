package Book;

public class SimpleBook implements Book{

    private String Title;
    private String Author;

    public SimpleBook (String title, String author){
        this.Title = title;
        this.Author = author;
    }
    @Override
    public String getTitle() {
        return Title;
    }

    @Override
    public String getAuthor() {
        return Author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book author is " + Author + " and title is " + Title);
    }
}

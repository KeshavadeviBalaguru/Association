package composition;

public class Book {
	 
    public String title;
    public String author;
 
    // Constructor of Book class
    public  Book(String title, String author)
    {
 
        // This keyword refers to current instance itself
        this.title = title;
        this.author = author;

}
}

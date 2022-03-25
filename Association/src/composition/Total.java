package composition;
import java.util.ArrayList;
import java.util.List;

public class Total {

    public static void main(String[] args)
    {
 
     
        Book b1
            = new Book("wings of fire", "Kalam");
        Book b2
            = new Book("Fairy Tales", "Charles Perrault");
       
 
       
        List<Book> books = new ArrayList<Book>();
 
       
        books.add(b1);
        books.add(b2);
      
 
        Library library = new Library(books);
 
        List<Book> bks = library.getTotalBooksInLibrary();
 
 
        for (Book bk : bks) {
 
            System.out.println("Title : " + bk.title
                               + " and "
                               + " Author : " + bk.author);
        }
  
}

}

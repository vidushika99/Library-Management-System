package library;
//this is the BOOk class that contain book details

public class Book  extends LibraryItem{
    private String author;
    private String publisher;
    private int noOfPages;

    public Book(String ISBN, String title, String sector, String publication_date,String author, String publisher, int noOfPages) {
        super(ISBN, title, sector, publication_date);
        this.author = author;
        this.publisher = publisher;
        this.noOfPages = noOfPages;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}

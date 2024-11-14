public class book{
    String title;
    String author;
    int yearPublished;

    public book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }

    public static void main(String[] args) {
        
        book myBook = new book("1984", "George Orwell", 1949);
        
        myBook.displayDetails();
    }
}

public class Book {
    private String title;
    private String author;
    private boolean isDeleted;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isDeleted=isDeleted();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void delete() {
        if (!isDeleted) {
            isDeleted = true;
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Sorry, the book is already deleted.");
        }
    }

    public void returnBook() {
        if (isDeleted) {
            isDeleted = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("The book was not issued.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Issued: " + isDeleted;
    }
}

import java.util.Objects;

public class book {
    private String nameBook;
    private author fullName;

    private int publicationYear;

    public book(String nameBook, author fullName, int publicationYear) {
        this.nameBook = nameBook;
        this.fullName = fullName;
        this.publicationYear = publicationYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public String toString() {
        return
                "Название книги: " + nameBook + '\'' +
                        ", Об авторе книги: " + fullName +
                        ", Год публикации: " + publicationYear ;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public author getFullName() {
        return fullName;
    }

    public void setFullName(author fullName) {
        this.fullName = fullName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        book book = (book) o;
        return publicationYear == book.publicationYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(fullName, book.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, fullName, publicationYear);
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear <= 0) {
            System.out.println("Дата публикации не корректна ");
        }
        this.publicationYear = publicationYear;
    }
}
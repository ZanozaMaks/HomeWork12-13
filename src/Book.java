import java.util.Objects;

public class Book {
    String nameBook;
    Author fullName;

    int publicationYear;

    public Book(String nameBook, Author fullName, int publicationYear) {
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

    public Author getFullName() {
        return fullName;
    }

    public void setFullName(Author fullName) {
        this.fullName = fullName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
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
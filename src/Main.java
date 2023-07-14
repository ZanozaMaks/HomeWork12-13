public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Книга1", new Author("Максим","Михаилович"), 1950);
        Book book2 = new Book("Книга2", new Author("Михаил","Максимович"), 1970);

        book1.setPublicationYear(1965);

        System.out.println(book1);
        System.out.println(book2);

        book1.getPublicationYear();

        Author author1 = new Author("Максим", "Михаилович");
        Author author2 = new Author("Михаил","Максимович");

        author1.eqs(author1.equals(author2));
    }
}
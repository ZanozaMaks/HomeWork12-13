public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Книга1", new Author("Максим","Михаилович"), 1950);
        Book book2 = new Book("Книга2", new Author("Михаил","Максимович"), 1970);
        Book book3 = new Book("Книга3", new Author("Николай","Сысоевич"), 1970);


        book1.setPublicationYear(1965);
        book2.setPublicationYear(1980);



        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.getFullName()); // Автор 1 книги
        System.out.println(book2.getFullName()); // Автор 2 книги
        System.out.println(book3.getFullName()); // Автор 3 книги

        book1.getPublicationYear();
        book3.getNameBook();
        book3.getFullName();



        Author author1 = new Author("Максим", "Михаилович");
        Author author2 = new Author("Михаил","Максимович");

        author1.eqs(author1.equals(author2));
    }
}
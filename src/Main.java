public class Main {
    public static void main(String[] args) {

        book book1 = new book("Книга1", new author("Максим","Михаилович"), 1950);
        book book2 = new book("Книга2", new author("Михаил","Максимович"), 1970);
        book book3 = new book("Книга3", new author("Николай","Сысоевич"), 1970);


        book1.setPublicationYear(1965);
        book2.setPublicationYear(1980);

        System.out.println(book1);
        System.out.println(book2);

        book1.getPublicationYear();
        book3.getNameBook();
        book3.getFullName();

        author author1 = new author("Максим", "Михаилович");
        author author2 = new author("Михаил","Максимович");



        author1.eqs(author1.equals(author2));
    }
}
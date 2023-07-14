import java.util.Objects;

public class Author {

    String name;
    String sureName;

    public void eqs (boolean eqs) {
        if (!eqs) {
            System.out.println("Авторы не равны");
        } else {
            System.out.println("Авторы равны");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(sureName, author.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sureName);
    }

    @Override
    public String toString() {
        return "Автор: " +
                "Имя: " + name + '\'' +
                ", Фамилия: " + sureName + '\'';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Author(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }
}
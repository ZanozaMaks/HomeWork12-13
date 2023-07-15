import java.util.Objects;

public class author {

    private String name;
    private String sureName;

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

    public author(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

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
        author author = (author) o;
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

}
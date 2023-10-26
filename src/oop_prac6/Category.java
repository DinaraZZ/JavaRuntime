package oop_prac6;

public class Category {
    private final String name;

    public Category(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Category category = (Category) obj;
        return name.equals(category.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Категория: " + name + "\n";
    }

    public String getName() {
        return name;
    }
}

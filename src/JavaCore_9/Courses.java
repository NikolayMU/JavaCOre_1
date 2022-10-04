package JavaCore_9;

public class Courses implements Course {
    private String name;

    public Courses(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
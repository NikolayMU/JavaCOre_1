package JavaCore_1;

public class Team {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("JAKE", 355);
        person[1] = new Person("Rose", 250);
        person[2] = new Person("MIKE", 400);
        person[3] = new Person("RONALD", 750);
        Group group = new Group("Команда мечты", person);

        Course course = new Course(250,350,410);
        String result = course.doIt(group);
        System.out.println(result);

    }

}

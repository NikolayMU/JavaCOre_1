package JavaCore_9;

import java.util.*;
import java.util.stream.Collectors;

        public class Main {
            public static void main(String[] args) {
                Course course1 = new Courses("Русский язык");
                Course course2 = new Courses("Английский язык");
                Course course3 = new Courses("Математика");
                Course course4 = new Courses("Литература");
                Course course5 = new Courses("Труд");
                Course course6 = new Courses("Физкультура");

        List<Student> students = Arrays.asList(
                new Students("Агеев", Arrays.asList(course1, course6)),
                new Students("Лупин", Arrays.asList(course2, course3, course4)),
                new Students("Новиков", Arrays.asList(course1, course3, course5)),
                new Students("Устинов", Arrays.asList(course1, course2, course5, course4, course3)),
                new Students("Краснов", null)
        );

        System.out.println(getUniqueCourses(students)); // получение уникальных названий предметов/курсов
        System.out.println(getInquisitiveStudent(students)); // получение студентов, посещающих максимальное кол-во курсов
        System.out.println(getStudentsByCourses(students, course2)); //получение студентов посещающих курс 2 (Английский язык)
    }

    public static List<Course> getUniqueCourses(List<Student> students) {
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .map(Student::getAllCourses)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Student> getInquisitiveStudent(List<Student> students) {
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .sorted((o1, o2) -> {
                    List<Course> c1 = o1.getAllCourses();
                    List<Course> c2 = o2.getAllCourses();
                    return Integer.compare(
                            c2 == null ? 0 : c2.size(),
                            c1 == null ? 0 : c1.size()
                    );
                })
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Student> getStudentsByCourses(List<Student> students, Course course) {
        if (course == null) {
            return new ArrayList<>();
        }

        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .filter(student -> {
                    List<Course> courses = student.getAllCourses();
                    courses = courses == null ? Collections.emptyList() : courses;
                    return courses.contains(course);
                })
                .collect(Collectors.toList());
    }
}
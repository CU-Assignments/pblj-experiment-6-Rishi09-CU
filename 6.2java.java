import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " " + marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 70),
            new Student("Charlie", 90),
            new Student("David", 65),
            new Student("Eve", 80)
        );

        List<Student> filteredStudents = students.stream()
            .filter(s -> s.marks > 75)
            .sorted(Comparator.comparingDouble(s -> -s.marks))
            .collect(Collectors.toList());

        filteredStudents.forEach(System.out::println);
    }
}

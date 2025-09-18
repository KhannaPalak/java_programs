import java.util.*;

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    int getId() { return id; }
    String getName() { return name; }
    double getCgpa() { return cgpa; }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(33, "Rumpa", 3.68));
        students.add(new Student(85, "Ashish", 3.85));
        students.add(new Student(56, "Samiha", 3.75));
        students.add(new Student(19, "Samara", 3.75));
        students.add(new Student(22, "Fahim", 3.76));

        students.sort(
            Comparator.comparingDouble(Student::getCgpa).reversed()
                      .thenComparing(Student::getName)
                      .thenComparingInt(Student::getId)
        );

        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

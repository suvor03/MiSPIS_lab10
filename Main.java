import src.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection<Lecturer> lecturers = new LinkedList<>();
        Collection<Student> students = new LinkedList<>();
        Collection<Course> courses = new LinkedList<>();
        Collection<Institute> institutes = new LinkedList<>();
        Collection<Faculty> faculties = new LinkedList<>();
        Collection<AdminEmployee> adminEmployees = new LinkedList<>();

        Lecturer lecturer = new Lecturer(1, 10, "iv@mail.ru",
                "Иванов И.И.", 4);
        lecturers.add(lecturer);

        Student student = new Student("Дмитрий");
        students.add(student);

        AdminEmployee adminEmployee = new AdminEmployee("Иванов И.И.", 100000,
                "ivan@mail.ru", 5, 2);
        adminEmployees.add(adminEmployee);

        Project project = new Project("Лабораторная работа 10",
                new Date(2023, Calendar.DECEMBER, 25),
                new Date(2023, Calendar.DECEMBER, 29));

        ResearchAssociate assistant = new ResearchAssociate("ФКН", "Иванов И.И.");

        Dean dean = new Dean("Иванов И.И.", 200000,
                "iva@mail.ru", 6, 3);

        Participation participation = new Participation(85.5);

        Course course = new Course("МИСПИС", 69, 420);
        courses.add(course);

        Institute institute = new Institute("IoT", "Россия, г. Воронеж, Университетская пл., д. 1, ауд. 381а");
        institutes.add(institute);

        Faculty faculty = new Faculty(dean, institutes, "ФКН");
        faculties.add(faculty);

        lecturers.forEach(System.out::println);
        students.forEach(System.out::println);
        courses.forEach(System.out::println);
        faculties.forEach(System.out::println);
        institutes.forEach(System.out::println);
        adminEmployees.forEach(System.out::println);
        System.out.println(participation);
        System.out.println(assistant);
        System.out.println(project);
    }
}
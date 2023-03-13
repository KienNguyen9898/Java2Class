package day8.BT3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // tao ds hoc sinh
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "NQQ1",18, "Male", 8 ));
        studentList.add(new Student(1, "NSS2",19, "Male", 9 ));
        studentList.add(new Student(1, "NGG3",20, "Female", 10 ));
        studentList.add(new Student(1, "NAD4",19, "Male", 7 ));

        //in ra tuoi tb
        final double[] t= {0};
        studentList.stream().forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                t[0] = t[0] + student.getAge();
            }
        });
        System.out.println("Tuoi tb: "+t[0]/studentList.size());

        //in ra cac ban lanam va diem lon hon 8 va ten phai co chu A
        studentList.stream().filter(student -> student.getGender().equals("Male") && student.getMark()>8)
                .filter(student -> student.getName().toLowerCase().contains("a"))
                .forEach(System.out::println);

        //tao 1 danh sach chi gom cac ban sv nu
        List<Student> newListStudent = studentList.stream().filter(student -> student.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList());
        System.out.println(newListStudent);
        System.out.println(studentList);



    }
}

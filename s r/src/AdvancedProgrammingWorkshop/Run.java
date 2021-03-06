package AdvancedProgrammingWorkshop;

import Student.Student;

public class Run {
    public static void main(String[] args) {

        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");

        System.out.println(std1.print());
        std1.setGrade(15);
        System.out.println(std1.print());

        System.out.println(std2.print());
        std2.setGrade(11);
        System.out.println(std2.print());

        System.out.println(std3.print());
        std3.setFirstName("HamidReza");
        System.out.println(std3.print());
        System.out.println();

        Lab lab = new Lab(3, "wednesday");

        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.enrollStudent(std3);

        System.out.println(lab.print());

    }
}

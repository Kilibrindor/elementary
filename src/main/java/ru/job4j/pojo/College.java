package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Lopatuxin A.V.");
        student.setGroup("EM - 11");
        student.setYear("01.09.2017");
        System.out.println(student.getName() + "Group : " + student.getGroup() + " Year:" + student.getYear());
    }
}

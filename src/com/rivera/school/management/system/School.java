package com.rivera.school.management.system;

import java.util.List;

/**
 * School can have Many teachers, many students.
 * Implements teachers and student
 * using ArrayList.
 * Created by Grethel Rivera on 7/21/22.
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     *
     * @param teacher list of teachers in the school.
     * @param student list of students in the school.
     */

    public School(List<Teacher> teacher, List<Student> student) {    //constructor
        this.teachers = teacher;
        this.students = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     *
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);  //adds a teacher to the array list created in the List<Teacher>teacher
    }

    /**
     * @return the list of students in the school.
     */
    public List<Student> getStudent() {
        return students;
    }

    /**
     * Adds a student to the school
     *
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school.
     * is the salary given by the school to the teachers
     *
     * @param moneySpent the money spent by school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}

package com.rivera.school.management.system;

/**
 * Created by Grethel Rivera 7/21/22
 * This class is responsible for keeping track
 * of teachers id, name, & salary
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */

    public Teacher(int id, String name, int salary) { //all unique
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return the id.
     */

    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */

    public String getName(){
        return name;
    }

    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary(){
        return salary;
    }

    /**
     * Set the Salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;

    }

    /**
     * Adds to salaryEarned
     * Removes the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                + "Total salary earned so far $"
                + salaryEarned;

    }

}


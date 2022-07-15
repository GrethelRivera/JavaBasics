package com.rivera.school.management.system;

/**
 * Created by Grethel Rivera on 7/20/22
 * This class is responsible for keeping
 * track of students id, name, grade, fees paid, fees total
 */

public class Student {   //declare the field
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     *
     * @param id    id for the student: unique.
     * @param name  name of the student.
     * @param grade grade of the student.
     */

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;




    }

    //Not going to alter student's name, student's id.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */

    public void setGrade(int grade) {     //setter method updates the grade
        this.grade=grade;

    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     */

    public void payFees(int fees) {
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    /**
     *
     * @return the id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of student.
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fess paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
       return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
      return "Student's name : "+name+
              " Total fees paid so far $"+ feesPaid;
    }
}

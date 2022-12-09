
package com.asuni.assignment.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "emp_table")
public class EmpModal {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String employee_name;
    private int employee_salary;
    private int employee_age;
    private String profile_image;

    public EmpModal(int id,String name, int age,int salary) {
        this.id=id;
        this.employee_name=name;
        this.employee_salary=salary;
        this.employee_age=age;
    }

    public EmpModal(){

    }



    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public int getId() {
        return id;
    }

    public String getProfile_image() {
        return profile_image;
    }
}
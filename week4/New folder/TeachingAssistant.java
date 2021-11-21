/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author USER
 */
public class TeachingAssistant implements staff {
private double number_of_hours , Salary;
 private int str_work, current_year;

@Override
    public void setStr_work(int str_work) {
        this.str_work = str_work;
    }

@Override
    public void setCurrent_year(int current_year) {
        this.current_year = current_year;
    }
    @Override
    public double GetSalary() {
        System.out.println("factorymethod.TeachingAssistant.GetSalary()");
        return number_of_hours*250;}

    @Override
    public double getYearsOfWork() {
        System.out.println("factorymethod.TeachingAssistant.getYearsOfWork()");
        return (current_year-str_work );}

    public void setnumber_of_hours(int  number_of_hours) {this.number_of_hours = number_of_hours;}

    @Override
    public void setSalary(double S) {
     Salary = S;
    }

   

}


package factorymethod;


public class Doctor implements staff {
 private double Salary;
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
    public void setSalary(double Salary) {this.Salary = Salary;}
@Override
    public double GetSalary() {
        System.out.println("factorymethod.Doctor.GetSalary()"); 
                return Salary;}
    @Override
    public double getYearsOfWork() {
        System.out.println("factorymethod.Doctor.getYearsOfWork()");
        return (current_year-str_work );}
    
}

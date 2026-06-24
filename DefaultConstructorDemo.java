class Employee {
int empId;
String empName;
double salary;

Employee() {
empId = 101;
empName = "Riya";
salary = 50000;

System.out.println("Employee Details:");
System.out.println("Employee ID: " + empId);
System.out.println("Employee Name: " + empName);
System.out.println("Salary: " + salary);
}
}

public class DefaultConstructorDemo {
public static void main(String[] args) {
Employee e = new Employee();
    }
}

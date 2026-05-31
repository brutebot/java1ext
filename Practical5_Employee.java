// Practical 5 - Encapsulation (Employee)
public class Employee {
    private int empId;
    private String name;

    public void setEmpId(int id) {
        empId = id;
    }

    public void setName(String n) {
        name = n;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Employee ID: " + getEmpId());
        System.out.println("Employee Name: " + getName());
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Rahul");
        emp.display();
    }
}

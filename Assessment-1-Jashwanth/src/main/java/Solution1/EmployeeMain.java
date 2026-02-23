package Solution1;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee(100, "Ravi", 45000);
        employee.display();

        Employee manager = new Manager(101, "Shiva", 70000, 10000);
        manager.display();
    }
}

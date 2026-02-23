package Solution1;

public class Manager extends Employee{
    private double bonus;

    public Manager(int id, String name, double salary, double bonus){
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void display() {
        System.out.println("\nManager Details:");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Bonus  : " + bonus);
        System.out.println("Total  : "+ (salary + bonus));
    }

}

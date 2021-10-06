package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private double salary;
    List<Employee> subordinates = new ArrayList<Employee>();

    public Manager() {
    }

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Manager(String name, double salary, List<Employee> subordinates) {
        this.name = name;
        this.salary = salary;
        this.subordinates = subordinates;
    }

    public void add(Employee subordinate) {
        subordinates.add(subordinate);
    }

    public Employee getChild(int i) {
        return subordinates.get(i);
    }

    public void remove(Employee subordinate) {
        subordinates.remove(subordinate);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Developer");
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("-------------");

        for (Employee employee : subordinates) {
            employee.print();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }
}

package composite;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new Developer("Dev 1", 10000);
        Employee emp2=new Developer("Dev 2", 15000);
        Employee manager1=new Manager("Manager 1",25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employee emp3=new Developer("Dev 3", 20000);
        Manager generalManager=new Manager("generalManager", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }
}

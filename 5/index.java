public class index {
    public static void main(String[] args){
        Employee emp1 = new Employee("John", 1, 10000);
        Manager emp2 = new Manager("Ron", 1, 250000, "IT");
        
        System.out.println(String.format("%s works under %s",emp1.getName(),emp2.getName()));
        System.out.println(String.format("%s is currently paid %d", emp1.getName(), emp1.getSalary()));
        emp1.increaseSalary(30);
        System.out.println(String.format("%s was given a 30 percent raise for high productivity, his current salary is now %d", emp1.getName(),emp1.getSalary()));
        System.out.println(String.format("%s manages the %s department", emp2.getName(),emp2.getDepartment()));
    }
}
class Employee{
    private String name;
    private int empid;
    private int salary;

    public Employee(String name, int empid, int salary){
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void increaseSalary(int percentage){
        float raise = salary *((float)percentage/100);
        this.salary = salary + (int)raise;
    }
}
class Manager extends Employee{
    private String department;
    public Manager(String name, int empid, int salary, String department){
        super(name, empid, salary);
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
}
public class Employee {
    private int id;
    private String name;
    private String job;
    private String department;
    private int age;
    private double salary;

    public Employee(int id, String name, String job, String department, int age, double salary) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public int getID() { return this.id; }
    public String getName() { return this.name; }
    public String getJob() { return this.job; }
    public String getDepartment() { return this.department; }
    public int getAge() { return this.age; }
    public double getSalary() { return this.salary; }
}

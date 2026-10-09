void main() {
    ArrayList<Employee> employees = new ArrayList<>();
    Employee employee1 = new Employee(325, "Alice", "Software Developer", "Finance", 25, 700);
    Employee employee2 = new Employee(556, "Bob", "DevOps Engineer", "Finance", 28, 600);
    Employee employee3 = new Employee(120, "Charlie", "Microsoft Azure Container Manager", "IT",32, 650);
    Employee employee4 = new Employee(333, "Doug", "Backend Developer", "Supply Chain", 22, 500);
    int option;

    employees.add(employee1);
    employees.add(employee2);
    employees.add(employee3);
    employees.add(employee4);

    do {
        IO.println("-------- Employee Management --------");
        IO.println("1. Add Employee");
        IO.println("2. Remove Employee");
        IO.println("3. Find Employee");
        IO.println("4. Find By Department");
        IO.println("5. Calculate Average Salary");
        IO.println("6. Exit");
        option = Integer.parseInt(IO.readln("Enter an option: "));

        switch (option) {
            // addEmployee()
            case 1:
                boolean dec = false;
                int ID;
                do {
                    ID = Integer.parseInt(IO.readln("Enter the ID of the employee: "));
                    for(Employee employee : employees) {
                        if(employee.getID() == ID) {
                            dec = true;
                            IO.println("Error! There's already an employee with that ID...");
                            break;
                        }
                        else dec = false;
                    }
                } while(dec);
                String name = IO.readln("Enter his/her name: ");
                String job = IO.readln("Enter his/her job: ");
                String dept = IO.readln("Enter his/her department: ");
                int age = Integer.parseInt(IO.readln("Enter his/her age: "));
                double salary = Integer.parseInt(IO.readln("Enter his/her salary: "));

                employees.add(new Employee(ID, name, job, dept, age, salary));
                IO.println("Employee added!");
                break;
            // removeEmployee()
            case 2:
                int search;
                boolean flag = false;
                do {
                    search = Integer.parseInt(IO.readln("Enter the id of the employee to remove: "));
                    for(Employee employee : employees) {
                        if(employee.getID() == search) {
                            employees.remove(employee);
                            IO.println("Employee removed");
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        IO.println("Error! The id doesn't exist");
                    }
                } while(!flag);
                break;
            // findEmployee()
            case 3:
                int id2;
                boolean flag2 = false;
                do {
                    id2 = Integer.parseInt(IO.readln("Enter the ID of the employee to search: "));
                    for(Employee employee : employees) {
                        if(employee.getID() == id2) {
                            IO.println("Name: " + employee.getName());
                            IO.println("Age: " + employee.getAge());
                            IO.println("Job: " + employee.getJob());
                            IO.println("Department: " + employee.getDepartment());
                            IO.println("Salary: $" + String.format("%.2f", employee.getSalary()));
                            flag2 = true;
                            break;
                        }
                    }
                    if(!flag2) IO.println("Error! The id doesn't exist");
                } while(!flag2);
                break;
            // findDepartment()
            case 4:
                boolean flag3 = false;
                String department = IO.readln("Enter the department to search the employees: ");
                for(Employee employee : employees) {
                    if(employee.getDepartment().equals(department)) {
                        flag3 = true;
                        break;
                    }
                }
                if(flag3) {
                    IO.println("List of employees:");
                    for(Employee employee : employees) {
                        if(employee.getDepartment().equals(department)) {
                            IO.println("Name: " + employee.getName());
                            IO.println("Job: " + employee.getJob());
                            IO.println("-----------------------------");
                        }
                    }
                }
                else {
                    IO.println("There's no one on that department!");
                }
                break;
            // calculateAverageSalary()
            case 5:
                double sum = 0;
                for(Employee employee : employees) {
                    sum += employee.getSalary();
                }
                IO.println("Average salary: $" + String.format("%.2f", sum / employees.size()));
                break;
            case 6:
                IO.println("See you later!");
                break;
            default:
                IO.println("Error! The option must be between 1 - 6");
        }
        IO.println("");
    } while(option != 6);
}
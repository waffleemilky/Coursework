import java.util.Objects;
public class Employee {
    private static int count = 1;
    private final String fullName;
    private int department;
    private double salary;
    private final int id;

    public Employee(int department, String fullName, double salary) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента нет");
        }
        this.department = department;
        this.id = count++;
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента нет");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Отдел: " + department +
                ", Фамилия: " + fullName +
                ", Зарплата: " + salary +
                ", id: " + id;
    }


}


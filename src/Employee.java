import java.util.Objects;
public class Employee {
    private static int count = 0;
    private final String fullName;
    private int department;
    private double salary;
    private final int id;

    public Employee(int department, String fullName, double salary) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Такого департамента нет");
        } else {
            this.department = department;
        }
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

    public static double calculateTotalSalary(Employee[] employees) {
        double total = 0;
        for (int i = 0; i < employees.length; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public static String[] getAllEmployeesData(Employee[] employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }

        String[] employeeDataArray = new String[count];

        int index = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeDataArray[index] = employee.toString();
                index++;
            }
        }
        return employeeDataArray;
    }

    public static Employee findMinSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return null;
        }

        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;

        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return null;
        }

        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;

        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
        }

    public static double calculateAverageSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return 0;
        }

        double totalSalary = calculateTotalSalary(employees);
        int employeeCount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                employeeCount++;
            }
        }

        if (employeeCount == 0) {
            return 0;
        }
        return totalSalary / employeeCount;
    }

    public static void printAllEmployeeFullNames(Employee[] employees) {
        System.out.println("ФИО всех сотрудников:");
        if (employees != null && employees.length > 0) {
            for (Employee employee : employees) {
                if (employee != null) {
                    System.out.println(employee.getFullName());
                }
            }
        } else {
            System.out.println("В массиве нет сотрудников.");
        }
    }

}


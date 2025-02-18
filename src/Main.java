public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee(1, "Иванов Иван Иванович", 30000);
        employees[1] = new Employee(2, "Иванова Ивана Ивановна", 35000);
        employees[2] = new Employee(3, "Олегов Олег Олегович", 40000);
        employees[3] = new Employee(4, "Олегова Оля Олеговна", 45000);
        employees[4] = new Employee(5, "Никитин Никита Никитич", 50000);
        employees[5] = new Employee(1, "Никитина Ника Никитична", 55000);
        employees[6] = new Employee(2, "Вовин Владимир Владимирович", 60000);
        employees[7] = new Employee(3, "Вовина Влада Владимировна", 65000);
        employees[8] = new Employee(4, "Александров Александр Александрович", 70000);
        employees[9] = new Employee(5, "Александрова Александра Александровна", 75000);

        printAllEmployeesData();
        System.out.println("Сумма ЗП сотрудников " + calculateSumOfSalaries());
        System.out.println("Сотрудник с мин ЗП " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с макс ЗП " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП " + calculateAverageOfSalaries());
        printEmployeesFullName();
    }

    public static void printAllEmployeesData() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    private static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries() / employees.length;
    }

    public static void printEmployeesFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

}
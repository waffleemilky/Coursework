public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
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

        String[] allEmployeesData = Employee.getAllEmployeesData(employees);

        System.out.println("Данные всех сотрудников:");
        for (String employeeData : allEmployeesData) {
            System.out.println(employeeData);
        }

        double totalSalary = Employee.calculateTotalSalary(employees);
        System.out.println("Общая зарплата: " + totalSalary);

        Employee minSalaryEmployee = Employee.findMinSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);

        Employee maxSalaryEmployee = Employee.findMaxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);

        double averageSalary = Employee.calculateAverageSalary(employees);
        System.out.println("Средняя зарплата: " + averageSalary);

        Employee.printAllEmployeeFullNames(employees);

    }
}
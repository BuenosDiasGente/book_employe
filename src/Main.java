public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        for (int i = 0; i < employee.length; i++) {
            employee[i] = new Employee("Petrov S.V." + i, 1 + (i % 5), 10000 + (i * 100));
        }

        printEmployees(employee);
        System.out.println();
        sumSalaryByMonth(employee);
        System.out.println();
        Employee minSalary = getMinSalary(employee);
        System.out.println("Сотрудник с минимальной зарплатой" + minSalary);
        System.out.println();
        Employee maxSalary = getMaxSalary(employee);
        System.out.println("Сотрудник с максимальной зарплатой" + maxSalary);
        System.out.println();
        averageSalary(employee);
        System.out.println();
        System.out.println("Ф. И. О. всех сотрудников: ");
        fullNameByEmployees(employee);
    }

    /**
     * The method gets a list of all employees with all the data available on them .
     */
    public static void printEmployees(Employee[] employee) {
        for (Employee employees : employee) {
            System.out.println(employees);
        }
    }

    /**
     * The method calculates the amount of salary costs per month.
     */
    public static void sumSalaryByMonth(Employee[] employees) {
        double result = 0;
        for (Employee employee : employees)
            result += employee.getSalary();
        System.out.println("Сумму затрат на зарплаты в месяц " + result);
    }

    /**
     * The method finds an employee with a minimum salary.
     */
    public static Employee getMinSalary(Employee[] employees) {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (result.getSalary() < employee.getSalary()) {
            }
        }
        return result;
    }

    /**
     * The method finds the employee with the maximum salary.
     */
    public static Employee getMaxSalary(Employee[] employees) {
        Employee result = employees[0];
        for (Employee value : employees) {
            if (result.getSalary() > value.getSalary()) {
            }
        }
        return result;
    }

    /**
     * The method calculates the average value of salaries.
     */
    public static void averageSalary(Employee[] employees) {
        double result = 0;
        for (int i = 0; i < employees.length; i++)
            result += employees[i].getSalary() / employees.length;
        System.out.println("Среднее значение затрат на зарплаты в месяц " + result);
    }

    /**
     * The method gets the full name of all employees.
     */
    public static void fullNameByEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            String name = employee.getName();
            System.out.print(" " + name + " ");
        }
    }
}



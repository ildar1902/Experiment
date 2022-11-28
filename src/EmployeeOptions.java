
public class EmployeeOptions {
    public static double calculateSumSalary() {
        double sum = 0;
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static void printEmployees() {
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void fndWorkerWithMinSalary() {
        double min = Integer.MAX_VALUE;
        String minSalaryEmployee = null;
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                minSalaryEmployee = employee.getFullName();
            }
        }
        System.out.println("Минимальная ЗП: " + min + " рублей. ФИО сотрудника: " + minSalaryEmployee);
    }

    public static void findWorkerWithMaxSalary() {
        double max = Integer.MIN_VALUE;
        String maxSalaryEmployee = null;
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                maxSalaryEmployee = employee.getFullName();
            }
        }
        System.out.println("Максимальная ЗП: " + max + " рублей. ФИО сотрудника: " + maxSalaryEmployee);
    }

    public static double findAverageSalary() {
        return calculateSumSalary() / (Main.EMPLOYEES.length);

    }

    public static void showListOfEmployees() {
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null)
                System.out.println(employee.getFullName());
        }
    }

    public static void changeSalary(double percent) {

        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
                System.out.printf("После индексации зарплаты " + employee.getFullName() + " получает "
                        + "%.0f" + " рублей%n", employee.getSalary());
            }
        }
    }

    public static void findWorkerWithMaxSalaryInDepartment(int number) {
        double max = Integer.MIN_VALUE;
        String maxSalaryEmployee = null;
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null && employee.getDepartment() == number && employee.getSalary() > max) {
                max = employee.getSalary();
                maxSalaryEmployee = employee.getFullName();
            }
        }
        System.out.printf(maxSalaryEmployee + " из " + number + "-го отдела зарабатывает %.0f "
                + " рублей в месяц. Это максимальная ЗП в этом отделе%n", max);
    }

    public static void findWorkerWithMinSalaryInDepartment(int number) {
        double min = Integer.MAX_VALUE;
        String minSalaryEmployee = null;
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null && employee.getDepartment() == number && employee.getSalary() < min) {
                min = employee.getSalary();
                minSalaryEmployee = employee.getFullName();
            }
        }
        System.out.printf(minSalaryEmployee + " из " + number + "-го отдела зарабатывает %.0f "
                + " рублей в месяц. Это минимальная ЗП в этом отделе%n", min);
    }

    public static double calculateSumSalaryInDepartment(int number) {
        double sum = 0;
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null && employee.getDepartment() == number) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static double findAverageSalaryInDepartment(int number) {
        int count = 0;
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null && employee.getDepartment() == number) {
                count++;
            }
        }
        return calculateSumSalaryInDepartment(number) / count;
    }

    public static void changeSalaryInDepartment(double percent, int number) {
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null && employee.getDepartment() == number) {
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * percent);
                System.out.printf("После индексации зарплаты в отделе № " + number + " " + employee.getFullName() + " получает "
                        + "%.0f" + " рублей%n", employee.getSalary());
            }
        }
    }

    public static void printEmployeesDepartment(int number) {
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null && employee.getDepartment() == number) {
                System.out.println(employee.getDepartmentInfo());
            }
        }
    }

    public static void findWorkerWithSalaryLessThanOther(double numberOther) {
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null  && employee.getSalary() < numberOther){
                 employee.getDepartmentInfo();
                System.out.println("Сотрудник, ЗП которого меньше "+ numberOther + " рублей: " + employee.getDepartmentInfo());
            }
        }
    }
    public static void findWorkerWithSalaryMoreThanOther(double numberOther) {
        for (Employee employee : Main.EMPLOYEES) {
            if (employee != null  && employee.getSalary() >= numberOther){
                System.out.println("Сотрудник, ЗП которого больше "+ numberOther + " рублей: " + employee.getDepartmentInfo());
            }
        }
    }
}

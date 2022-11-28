public class Main {
    public static Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {

//Черновик курсовой

        System.out.println("                Черновик курсовой");
        //хранилище для записей о сотрудниках
        EMPLOYEES[0] = new Employee("Андреев", "Матвей", "Адамович", 1, 50_435);
        EMPLOYEES[1] = new Employee("Жукова", "Есения", "Ильинична", 1, 43_565);
        EMPLOYEES[2] = new Employee("Федорова", "Вероника", "Михайловна", 2, 45_635);
        EMPLOYEES[3] = new Employee("Щербаков", "Михаил", "Владимирович", 3, 50_800);
        EMPLOYEES[4] = new Employee("Волков", "Артём", "Алексеевич", 4, 65_000);
        EMPLOYEES[5] = new Employee("Осипова", "Анастасия", "Дмитриевна", 2, 51_990);
        EMPLOYEES[6] = new Employee("Воробьёва", "Малика", "Валерьевна", 5, 45_190);
        EMPLOYEES[7] = new Employee("Кулешов", "Роман", "Эминович", 4, 55_490);
        EMPLOYEES[8] = new Employee("Королёв", "Илья", "Львович", 3, 53_090);
        EMPLOYEES[9] = new Employee("Морозова", "Александра", "Марковна", 5, 65_290);
        System.out.println("    Список сотрудников со всеми имеющимися по ним данными: ");
        EmployeeOptions.printEmployees(); // вызов метода, который выводит в консоль список всех сотрудников
        System.out.println();
        double amountSalaryCosts = EmployeeOptions.calculateSumSalary(); // вызов метода, который считает сумму затрат на ЗП в месяц
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + amountSalaryCosts + " рублей");
        System.out.println();
        EmployeeOptions.fndWorkerWithMinSalary(); // вызов метода, который находит сотрудника с минимальной зп
        System.out.println();
        EmployeeOptions.findWorkerWithMaxSalary(); // вызов метода, который находит сотрудника с максимальной зп
        System.out.println();
        double averageSalary = EmployeeOptions.findAverageSalary(); //вызов метода, который считает среднюю зп
        System.out.println("Средняя зарплата сотрудников = " + averageSalary);
        System.out.println();
        System.out.println("    Список ФИО всех сотрудников: ");
        EmployeeOptions.showListOfEmployees(); // вызов метода, который выводит ФИО всех сотрудников
        EMPLOYEES[1].setSalary(EMPLOYEES[1].getSalary());
        System.out.println("employees[1].getSalary() = " + EMPLOYEES[1].getSalary());
        System.out.println();

//        начало заданий повышенной сложности
        double increasingSalary = 7; // величина изменения ЗП
        EmployeeOptions.changeSalary(increasingSalary); // вызов метода, который индексирует ЗП
        System.out.println();
        int numberDepartment = 4; //задаваемый номер отдела
        EmployeeOptions.findWorkerWithMaxSalaryInDepartment(numberDepartment);// поиск сотрудника с максимальной зп в отделе
        System.out.println();
        EmployeeOptions.findWorkerWithMinSalaryInDepartment(numberDepartment);// поиск сотрудника с минимальной зп в отделе
        System.out.println();
        double amountSalaryInDepartment = EmployeeOptions.calculateSumSalaryInDepartment(numberDepartment); //сумма зп в отделе
        System.out.printf("В " + numberDepartment + "-м отделе сумма затрат на ЗП в месяц равна %.0f"
                + " рублей %n", amountSalaryInDepartment);
        System.out.println();
        double averageSalaryInDepartment = EmployeeOptions.findAverageSalaryInDepartment(numberDepartment);// средняя зп в отделе
        System.out.printf("Средняя ЗП в " + numberDepartment + "-м отделе = %.2f" + " рублей %n", averageSalaryInDepartment);
        System.out.println();
        EmployeeOptions.changeSalaryInDepartment(increasingSalary, numberDepartment);//индексация зп в рамках отдела
        System.out.println();
        System.out.println("    Все сотрудники " + numberDepartment + "-го отдела");
        EmployeeOptions.printEmployeesDepartment(numberDepartment); //печать всех сотрудников отдела
        System.out.println();
        double otherNumber = 50_000; //задаваемое число, для сравнения
        EmployeeOptions.findWorkerWithSalaryLessThanOther(otherNumber);// вывод сотрудников, чья зп меньше указываемого числа
        System.out.println();
        EmployeeOptions.findWorkerWithSalaryMoreThanOther(otherNumber);//вывод сотрудников, чья зп больше указываемого числа

    }
}








public class Main {
    public static void main(String[] args) {
     //   Coursework.printEmployees();
     //   System.out.println("Сумма расходов на зарплату сотрудникам - " + Coursework.calculateSalaryCosts());
     //   System.out.println();
     //   System.out.println("Cотрудник с минимальной зарплатой - " + Coursework.findMinSalaryEmployer());
     //   System.out.println();
     //   System.out.println("Сотрудник с максимальной зарплатой - " + Coursework.findMaxSalaryEmployer());
     //   System.out.println();
     //   System.out.println("Средняя сумма зарплаты - " + Coursework.findAverageValue());
     //   System.out.println();
     //   Coursework.printAllNames();
     //   System.out.println();
     //   Coursework.findIndexSalary(18);
     //   System.out.println();

     //   System.out.println();
     //   System.out.println("Сотрудник с максимальной зарплатой в отделе - " + Coursework.findMaxSalaryEmployerDepartment(4));
     //   System.out.println();
     //   System.out.println("Сумма зарплат по отделу - " + Coursework.calculateSalaryCostsInDepartment(2));
     //   System.out.println();
     //   System.out.println("Средняя зарплата по отделу - " + Coursework.findAverageValueInDepartment(1));
     //   System.out.println();
     //   System.out.println("Проиндексированная зарплата всех сотрудников отдела: " + Coursework.findIndexingSalaryOfDepartment(1, 10));
     //   System.out.println();
     //   Coursework.printEmployeesOfDepartment(1);
     //   System.out.println();
     //   Coursework.findEmployeesWithASalaryLess(2000);
     //   System.out.println();
     //   Coursework.findEmployeesWithASalaryGreater(2000);

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.createNewEmployee("Теребонькин Иван Николаевич", 1, 3000f);
        employeeBook.createNewEmployee("Лупкин Андрей Андреевич", 2, 1500f);
        employeeBook.createNewEmployee("Пупкин Станислав Викторович", 3, 1200f);
     //   employeeBook.createNewEmployee("Сладенький Егор Владимирович", 4, 1800f);
     //   employeeBook.createNewEmployee("Ананьев Сосик Гарникович", 5, 2100f);
        employeeBook.createNewEmployee("Забейворота Павел Афанасьевич", 1, 2000f);
        employeeBook.createNewEmployee("Кривоконь Илья Васильевич", 2, 2300f);
        employeeBook.createNewEmployee("Фриман Гордон Валерьевич", 5, 2000f);
        employeeBook.createNewEmployee("Букин Геннадий Зенденович", 4, 1300f);
        employeeBook.createNewEmployee("Кондольский Пельмень Марсельевич", 5, 2000f);



        employeeBook.printEmployees();
     //   System.out.println();
     //   employeeBook.deleteEmployeeByFIO("Теребонькин Иван Николаевич");
     //   employeeBook.printEmployees();
     //   System.out.println();
     //   employeeBook.createNewEmployee("Пиволюб Харитон Кириллович", 1, 1900f);
     //   employeeBook.printEmployees();
     //   System.out.println();
     //   employeeBook.changeSalary("Лупкин Андрей Андреевич", 100);
     //   employeeBook.printEmployees();
     //   System.out.println();
     //   employeeBook.changeDepartment("Лупкин Андрей Андреевич", 5);
     //   employeeBook.printEmployees();
     //   employeeBook.printEmployeesFIOByDepartment();


    }
}
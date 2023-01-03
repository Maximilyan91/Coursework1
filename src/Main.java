public class Main {
    public static void main(String[] args) {
        Coursework.printEmployees();
        System.out.println("Сумма расходов на зарплату сотрудникам - " + Coursework.calculateSalaryCosts());
        System.out.println();
        System.out.println("Cотрудник с минимальной зарплатой - " + Coursework.findMinSalaryEmployer());
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой - " + Coursework.findMaxSalaryEmployer());
        System.out.println();
        System.out.println("Средняя сумма зарплаты - " + Coursework.findAverageValue());
        System.out.println();
        Coursework.printAllNames();
        System.out.println();
        Coursework.findIndexSalary(18);
        System.out.println();

        System.out.println("Сотрудник с минмиальной зарплатой в отделе - " + Coursework.findMinSalaryEmployerDepartment(4));
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой в отделе - " + Coursework.findMaxSalaryEmployerDepartment(4));
        System.out.println();
        System.out.println("Сумма зарплат по отделу - " + Coursework.calculateSalaryCostsInDepartment(2));
        System.out.println();
        System.out.println("Средняя зарплата по отделу - " + Coursework.findAverageValueInDepartment(1));
    }

}
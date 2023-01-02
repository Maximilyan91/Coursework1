public class Main {
    public static void main(String[] args) {
        Coursework.printEmployees();
        System.out.println("Сумма расходов на зарплату сотрудникам - " + Coursework.calculateSalaryCosts());
        System.out.println("Cотрудник с минимальной зарплатой - " + Coursework.findMinSalaryEmployer());
        System.out.println("Сотрудник с максимальной зарплатой - " + Coursework.findMaxSalaryEmployer());
        System.out.println("Средняя сумма зарплаты - " + Coursework.findAverageValue());
        Coursework.printAllNames();

    }
}
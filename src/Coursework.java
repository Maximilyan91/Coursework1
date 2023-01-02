public class Coursework {

 /* Создать внутри класса с методом main поле типа Employee[10],
 * которое будет выполнять роль «хранилища» для записей о сотрудниках.
 */

    public static final Employee[] empl = {
            new Employee("Теребонькин Иван Николаевич", 1, 3000f),
            new Employee("Лупкин Андрей Андреевич ", 2, 1500f),
            new Employee("Пупкин Станислав Викторович", 3, 1200f),
            new Employee("Сладенький Егор Владимирович", 4, 1800f),
            new Employee("Ананьев Сосик Гарникович", 5, 2100f),
            new Employee("Забейворота Павел Афанасьевич", 1, 1600f),
            new Employee("Кривоконь Илья Васильевич", 2, 2300f),
            new Employee("Фриман Гордон Валерьевич", 5, 2000f),
            new Employee("Букин Геннадий Зенденович", 4, 1800f),
            new Employee("Кондольский Пельмень Марсельевич", 5, 2000f)
    };

// Получить список всех сотрудников со всеми имеющимися по ним данными (с помощью цикла foreach)
    public static void printEmployees() {
        for (Employee printEmpl : empl) {
            System.out.println(printEmpl);
        }
    }
// Посчитать сумму затрат на зарплаты в месяц.
    public static void calculateSalaryCosts() {
        float sum = 0;
        for (Employee salaryCosts: empl) {
            sum += salaryCosts.getSalary();
        }
        System.out.println("Сумма трат на зарплату в месяц - " + sum);
    }
// Поиск сотрудника с минимальной зарплатой
    public static void findMinSalaryEmployer() {
        Employee result = empl[0];                    //Объявляю переменную result и присваиваю ей значение первой ячейки массива
        float minSalary = 10000;                      //Объявляю переменную minSalary и присваиваю ей максимально возможное значение (потолок)
        for (Employee employee : empl) {              // Для каждой ячейки массива
            if (employee.getSalary() < minSalary) {   // Если значение элемента salary меньше 10000
                minSalary = employee.getSalary();     // То присвоить переменной minSalary значение salary из 0 ячейки массива (потом из 1, 2... и т.д.)
                result = employee;                    // переменной result присваиваю значение ячейки из цикла
            }

        }


        System.out.println("Сотрудник с минимальной зарплатой - " + result);
    }
    // Поиск сотрудника с максимальной зарплатой
    public static void findMaxSalaryEmployer() {
        Employee result = empl[0];
        float maxSalary = empl[0].getSalary();
        for (Employee employee : empl) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }

        }


        System.out.println("Сотрудник с максимальной зарплатой - " + result);
    }
// Подсчет среднего значения зарплат.

    public static void findAverageValue(float sum) {

    }

}

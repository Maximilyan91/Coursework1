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
            new Employee("Забейворота Павел Афанасьевич", 1, 2000f),
            new Employee("Кривоконь Илья Васильевич", 2, 2300f),
            new Employee("Фриман Гордон Валерьевич", 5, 2000f),
            new Employee("Букин Геннадий Зенденович", 4, 1300f),
            new Employee("Кондольский Пельмень Марсельевич", 5, 2000f)
    };

    // Получить список всех сотрудников со всеми имеющимися по ним данными (с помощью цикла foreach)
    public static void printEmployees() {
        for (Employee printEmpl : empl) {
            System.out.println(printEmpl);
        }
    }

    // Посчитать сумму затрат на зарплаты в месяц.
    public static float calculateSalaryCosts() {
        float sum = 0;
        for (Employee salaryCosts : empl) {
            sum += salaryCosts.getSalary();
        }
        return sum;
    }

    // Поиск сотрудника с минимальной зарплатой
    public static Employee findMinSalaryEmployer() {
        Employee result = empl[0];                    //Объявляю переменную result и присваиваю ей значение первой ячейки массива
        float minSalary = 10000;                      //Объявляю переменную minSalary и присваиваю ей максимально возможное значение (потолок)
        for (Employee employee : empl) {              // Для каждой ячейки массива
            if (employee.getSalary() < minSalary) {   // Если значение элемента salary меньше 10000
                minSalary = employee.getSalary();     // То присвоить переменной minSalary значение salary из 0 ячейки массива (потом из 1, 2... и т.д.)
                result = employee;                    // переменной result присваиваю значение ячейки из цикла
            }
        }
        return result;
    }

    // Поиск сотрудника с максимальной зарплатой
    public static Employee findMaxSalaryEmployer() {
        Employee result = empl[0];
        float maxSalary = empl[0].getSalary();
        for (Employee employee : empl) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    // Подсчет среднего значения зарплат.
    public static float findAverageValue() {
        return calculateSalaryCosts() / (float) empl.length;
    }

    // Получаем ФИО всех сотрудников.
    public static void printAllNames() {
        for (Employee employee : empl) {
            System.out.println(employee.getFullName());
        }
    }
// Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).

    public static void findIndexSalary(float index) {
        float correctSalary;
        for (Employee employee : empl) {
            float salary = employee.getSalary();
            correctSalary = (((index / 100) + 1) * salary);
            System.out.println("Проиндексированная зарплата сотрудника - " + employee.getFullName() + " составляет " + correctSalary);
        }
    }
// Получить в качестве параметра номер отдела (1–5) и найти сотрудника с минимальной зарплатой

    public static Employee findMinSalaryEmployerDepartment(int department) {
        float minSalary = Integer.MAX_VALUE;                       // Объявляем переменную и присваиваем ей минимальное значение
        Employee result = empl[0];                                 // Объявляем переменную типа Employee и присваиваю ей значение первой ячейки массива
        for (Employee employee : empl) {                           // Для каждой ячейки массива
            if (employee.getDepartment() != department) {          // Если гетдепартмент не равен входной переменной департмент
                continue;                                          // то продолжаем
            }
            if (employee.getSalary() < minSalary) {                // Если зп меньше мин. значения
                minSalary = employee.getSalary();                  // то присваиваем ей это значение
                result = employee;                                 // а переменной result присваиваем значение этой ячейки
            }
        }
        return result;
    }

// Находим сотрудника с минимальной зарплатой

    public static Employee findMaxSalaryEmployerDepartment(int department) {
        float maxSalary = 1.0f;
        Employee result = empl[0];
        for (Employee employee : empl) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    // Выводим сумму затрат на зарплату по отделу
    public static float calculateSalaryCostsInDepartment(int department) {
        float sum = 0;
        for (Employee employee : empl) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    // Получаем среднюю зарплату по отделу.
    public static float findAverageValueInDepartment(int department) {
        int numberOfEmpl = 0;
        int sum = 0;
        for (Employee employee : empl) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                numberOfEmpl++;
            }
        }
        return sum / (float)numberOfEmpl;
    }

    // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    public static float findIndexingSalaryOfDepartment(int department, float percent) {
        float totalSalary = 0f;
        float indexingTotalSalary = 0f;
        for (Employee employee : empl) {
            if (employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
            indexingTotalSalary = totalSalary * ((percent / 100) + 1);
        }
        return indexingTotalSalary;
    }
   // Напечатать всех сотрудников отдела (все данные, кроме отдела).

    public static void printEmployeesOfDepartment(int department) {
        for (Employee employee : empl) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + " " + employee.getSalary());
            }

        }
    }
// Получить в качестве параметра число и найти: Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void findEmployeesWithASalaryLess(int number) {
        for (Employee employee : empl) {
            if (employee.getSalary() < (float) number) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());

            }
        }
    }
//Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
    public static void findEmployeesWithASalaryGreater(int number) {
        for (Employee employee : empl) {
            if (employee.getSalary() >= (float) number) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());

            }
        }
    }
}


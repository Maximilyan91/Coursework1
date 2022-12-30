public class Coursework {

    public static void main(String[] args) {

    /* Создать внутри класса с методом main поле типа Employee[10],
     * которое будет выполнять роль «хранилища» для записей о сотрудниках.
     */

        Employee[] empl = new Employee[10];
        empl[0] = new Employee("Теребонькин Иван Николаевич", 1, 1000f);
        empl[1] = new Employee("Лупкин Андрей Андреевич ", 2, 1500f);
        empl[2] = new Employee("Пупкин Станислав Викторович", 3, 1200f);
        empl[3] = new Employee("Сладенький Егор Владимирович", 4, 1800f);
        empl[4] = new Employee("Ананьев Сосик Гарникович", 5, 2100f);
        empl[5] = new Employee("Забейворота Павел Афанасьевич", 1, 1600f);
        empl[6] = new Employee("Кривоконь Илья Васильевич", 2, 2300f);
        empl[7] = new Employee("Фриман Гордон Валерьевич", 5, 2000f);
        empl[8] = new Employee("Букин Геннадий Зенденович", 4, 1800f);
        empl[9] = new Employee("Кондольский Пельмень Марсельевич", 5, 2000f);

// Получить список всех сотрудников со всеми имеющимися по ним данными (с помощью цикла foreach)

            for (Employee e : empl) {
                System.out.println(e);
            }

// Посчитать сумму затрат на зарплаты в месяц.
        // Статический метод чтобы посчитать сумму затрат на зарплаты в месяц.

            float sum = 0;
        for (Employee e : empl) {
            sum += empl.getSalary();
        }

    }

}

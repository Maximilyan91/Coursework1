public class Employee {

//Создание полей
    String fullName;
    int department;
    float salary;
    int id;
     static int idCount;

// Создание геттеров (возможность получать значения полей из Employee)
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public float getSalary() {
        return salary;


    }
// Создание сеттеров (возможность устанавливать значения полей отдела и зарплаты)

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

// Создание конструктора для вывода полей Employee

    public Employee(String fullName, int department, float salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++idCount;
    }
// Переопределение метода toString для вывода на консоль информации о сотрудниках
    @Override
    public String toString() {
        return "ФИО: " + fullName + ", Департамент №" + department + ", Зарплата - " + salary + ", id = " + id;
    }






}

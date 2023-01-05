import static java.lang.Integer.MAX_VALUE;

class EmployeeBook {

    private static final Integer employeeBookSize = 10;
    private final Employee[] empl = new Employee[employeeBookSize];

    public void printEmployees() {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                System.out.println(empl[i]);
            }else{
                System.out.println("Ячейка №" + (i+1) + " пустая");
            }
        }
    }

    public float calculateSalaryCosts() {
        float sum = 0;
        for (Employee salaryCosts : empl) {
            sum += salaryCosts.getSalary();
        }
        return sum;
    }

    public Employee findMinSalaryEmployer() {
        Employee result = empl[0];
        float minSalary = 10000;
        for (Employee employee : empl) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public Employee findMaxSalaryEmployer() {
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

    public float findAverageValue() {
        return calculateSalaryCosts() / (float) empl.length;
    }

    public void printAllNames() {
        for (Employee employee : empl) {
            System.out.println(employee.getFullName());
        }
    }

    public void findIndexSalary(float index) {
        float correctSalary;
        for (Employee employee : empl) {
            float salary = employee.getSalary();
            correctSalary = (((index / 100) + 1) * salary);
            System.out.println("Проиндексированная зарплата сотрудника - " + employee.getFullName() + " составляет " + correctSalary);
        }
    }

    public Employee findMinSalaryEmployerDepartment(int department) {
        float minSalary = MAX_VALUE;
        Employee result = empl[0];
        for (Employee employee : empl) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public Employee findMaxSalaryEmployerDepartment(int department) {
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

    public float calculateSalaryCostsInDepartment(int department) {
        float sum = 0;
        for (Employee employee : empl) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public float findAverageValueInDepartment(int department) {
        int numberOfEmpl = 0;
        int sum = 0;
        for (Employee employee : empl) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
                numberOfEmpl++;
            }
        }
        return sum / (float) numberOfEmpl;
    }

    public float findIndexingSalaryOfDepartment(int department, float percent) {
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

    public void printEmployeesOfDepartment(int department) {
        for (Employee employee : empl) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + " " + employee.getSalary());
            }
        }
    }

    public void findEmployeesWithASalaryLess(int number) {
        for (Employee employee : empl) {
            if (employee.getSalary() < (float) number) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
            }
        }
    }

    public void findEmployeesWithASalaryGreater(int number) {
        for (Employee employee : empl) {
            if (employee.getSalary() >= (float) number) {
                System.out.println(employee.getId() + " " + employee.getFullName() + " " + employee.getSalary());
            }
        }
    }

//Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
//Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее. Искать нужно всегда с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.

    public void createNewEmployee(String fullName, int department, float salary) {
        int index = searchFreeIndex();
        if (index == -1) {
            System.out.println("Нет свободных мест");
            return;
        }
        empl[index] = new Employee(fullName, department, salary);
    }

    private int searchFreeIndex() {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] == null) {
                return i;
            }
        }
        return -1;
    }

    // Удалить сотрудника по ФИО
    public void deleteEmployeeByFIO(String fullName) {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getFullName().equals(fullName)) {
                empl[i] = null;
            }
        }
    }

    // Удалить сотрудника по id
    public void deleteEmployeeById(int id) {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getId() == id) {
                empl[i] = null;
            }
        }
    }
// Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись):
// Изменить зарплату.

    public void changeSalary(String fullName, int salary) {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getFullName().equals(fullName)) {
                empl[i].setSalary((float) salary);
            }
        }
    }

    // Изменить отдел.
    public void changeDepartment(String fullName, int department) {
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].getFullName().equals(fullName)) {
                empl[i].setDepartment(department);
            }
        }
    }

    //Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
    public void printEmployeesFIOByDepartment() {
        for (Employee employee : empl) {
            System.out.println(employee.getFullName() + " Отдел №" + employee.getDepartment());
        }
    }
}
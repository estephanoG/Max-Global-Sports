import java.util.HashMap;

public class EmployeeManager {
    private HashMap<String, Employee> employees;

    public EmployeeManager() {
        employees = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public Employee getEmployee(String id) {
        return employees.get(id);
    }

    public void listAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Nenhum Funcionario Encontrato.");
        } else {

            for (Employee employee : employees.values()) {
                System.out.println("---------------------------");
                System.out.println(employee);
                System.out.println("---------------------------");
            }
        }
    }
}

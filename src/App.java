import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Funcionario");
            System.out.println("2. Buscar Funcionario");
            System.out.println("3. Listar Funcionario");
            System.out.println("4. Apagar Funcionario");
            System.out.println("5. Sair");
            System.out.print("Escolha a opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Id do usuário: ");
                String id = scanner.nextLine();
                System.out.print("Nome: ");
                String name = scanner.nextLine();
                System.out.print("Alergia: ");
                String allergies = scanner.nextLine();
                System.out.print("Medicamento: ");
                String medicalConditions = scanner.nextLine();
                System.out.print("Email: ");
                String contactEmail = scanner.nextLine();
                System.out.print("Telefone: ");
                String contactPhone = scanner.nextLine();

                Employee employee = new Employee(id, name, allergies, medicalConditions, contactEmail, contactPhone);
                manager.addEmployee(employee);
                System.out.println("#########################");
                System.out.println("Adicionado com sucesso!");
                System.out.println("#########################");

            } else if (choice == 2) {
                System.out.print("ID Funcionario: ");
                String id = scanner.nextLine();
                Employee employee = manager.getEmployee(id);
                if (employee != null) {
                    System.out.println(employee);
                } else {
                    System.out.println("Funcionario não encontrato!");
                }

            } else if (choice == 3) {
                manager.listAllEmployees();
                
            } else if (choice == 4) { 
              System.out.println("ID do Funcionario para apagar:");
                String id = scanner.nextLine();
                boolean removed = manager.deleteEmployee(id);
                if(removed){
                    System.out.println("Funcionario removido com sucesso!");
                
                 } else { 
                    System.out.println("Funcionario não encontrado!");
                }

            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Opção incorreta tente novamente!");
            }
        }

        scanner.close();
    }
}

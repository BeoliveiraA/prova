import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();


        System.out.println("Digite o cargo do funcionário:");
        String cargo = scanner.nextLine();


        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();


        Funcionario funcionario = new Funcionario(nome, cargo, salario);


        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());


        System.out.println("Digite o valor do aumento:");
        double aumento = scanner.nextDouble();


        funcionario.aumentoDeSalario(aumento);


        System.out.println("Salário atualizado: " + funcionario.getSalario());


        scanner.close();
    }
}

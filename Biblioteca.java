import java.util.Scanner;


public class Biblioteca{
    public static void main(String[] args) {
        int Tipo;


        Scanner sc = new Scanner(System.in);


        System.out.println("Digite de 1 a 4 ");
        Tipo = sc.nextInt();


        if (Tipo == 1 || Tipo == 3) {
            System.out.println("Explore novos mundos!");
        } else if (Tipo == 2) {
            System.out.println("Descubra fatos incríveis!");
        } else if (Tipo == 4) {
            System.out.println("Inspire-se em histórias reais!");
        } else {
            System.out.println("Gênero não cadastrado.");
        }
    }
}

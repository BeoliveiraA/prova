import java.util.Scanner;


public class BibliotecaLivros {
    public static void main(String[] args) {
        int Tipo;


        Scanner sc = new Scanner(System.in);


        System.out.println("Digite de 1 a 4 ");
        Tipo = sc.nextInt();
       
        switch (Tipo) {
            case 1:
            case 3:
                System.out.println("Explore novos mundos!");
                break;
            case 2:
                System.out.println("Descubra fatos incríveis!");
                break;
            case 4:
                System.out.println("Inspire-se em histórias reais!");
                break;
            default:
                System.out.println("Gênero não cadastrado.");
                break;
        }
    }
}

import java.util.Locale;
import java.util.Scanner;


public class TryCatch01 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite Seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite Seu Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite Sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite Sua Altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Olá me chamo "+nome.toUpperCase()+" "+sobrenome.toUpperCase());
        System.out.println("Tenho "+idade+" anos");
        System.out.println("Minha altura é "+altura+" cm");
        scanner.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("O campos idade e altura precisam ser numéricos");
        }
        
    }
        
}
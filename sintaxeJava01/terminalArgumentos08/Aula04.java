import java.util.Locale;
import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {

        
        // Criando um Scanner para entrada de dados do teclado e definindo o local para US
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Solicitando e lendo o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        // Solicitando e lendo a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        // Exibindo as informações digitadas
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        
        // Fechando o Scanner para liberar recursos
        scanner.close();
    }
}

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicitar número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitar número da conta
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar input
       
        // Solicitar nome do cliente
        System.out.println("Por favor, digite o seu nome e sobrenome:");
        String nomeCliente = scanner.nextLine();

        // Solicitar saldo da conta
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Construir a mensagem
        String mensagem = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia).concat(", conta ").concat(Integer.toString(numero)).concat(" e seu saldo ")
        .concat(Double.toString(saldo)).concat(" já está disponível para saque.");

        // Exibir a mensagem
        System.out.println(mensagem);
    }
}

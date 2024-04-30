public class Aula03 {
    public static void main(String[] args) {
        // Verifica se há pelo menos 3 argumentos passados
        if(args.length >= 3) {
            // Imprime os 3 primeiros argumentos passados
            System.out.println("Argumento 1: " + args[0]);
            System.out.println("Argumento 2: " + args[1]);
            System.out.println("Argumento 3: " + args[2]);
        } else {
            // Caso não haja pelo menos 3 argumentos, exibe uma mensagem
            System.out.println("Pelo menos 3 argumentos são necessários.");
        }
    }
}
//Os argumentos são fornecidos durante a execução de um programa Java, geralmente através da linha de comando ou de configurações de ambiente específicas, como o arquivo launch.json no Visual Studio Code. 
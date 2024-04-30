public class Aula02 {
    public static void main(String[] args) {
        if(args.length > 0) { // Verifica se há argumentos passados
            String argumento = args[0]; // Armazena o primeiro argumento passado
            System.out.println(argumento); // Imprime o primeiro argumento
        } else {
            System.out.println("Nenhum argumento passado."); // Se nenhum argumento for passado, imprime esta mensagem
        }
    }
}
// Agora, ao passarmos argumentos para a execução do programa, ele irá imprimir o primeiro parâmetro.

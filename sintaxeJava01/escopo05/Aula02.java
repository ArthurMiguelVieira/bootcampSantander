public class Aula02 {
    // Variável global - pode ser acessada de qualquer lugar na classe
    static int globalVar = 10;

    // Método principal
    public static void main(String[] args) {
        // Variável local ao método main - só pode ser acessada dentro do main
        int localVarMain = 20;

        // Chamada de método que acessa variáveis locais e globais
        outroMetodo();
    }

    // Método que acessa variáveis globais e locais
    static void outroMetodo() {
        // Variável local ao método outroMetodo - só pode ser acessada dentro do outroMetodo
        int localVarOutroMetodo = 30;

        // Acessando variável global
        System.out.println("Variável global: " + globalVar);

        // Acessando variável local ao método outroMetodo
        System.out.println("Variável local ao outroMetodo: " + localVarOutroMetodo);

        // Não podemos acessar a variável local ao método main porque está fora do escopo
        //System.out.println("Variável local ao main: " + localVarMain); // Isso resultará em erro
    }
}

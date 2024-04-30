public class Aula05 {
    
    // OPERADOR TERNÁRIO VS IF-ELSE
    public static void main(String[] args) {
        boolean verdade = true;
        boolean verdade2 = false;
        String mensagemIfElse;
        if (verdade) {
            mensagemIfElse = "Estrutura if-else verdadeira";
        } else {
            mensagemIfElse = "Estrutura if-else falsa";
        }
        System.out.println("Com estrutura if-else: " + mensagemIfElse);

        String operadorTernario = verdade2==true ? "Operador Verdadeiro":"Operador Falso";

        System.out.println(operadorTernario);
    }
}

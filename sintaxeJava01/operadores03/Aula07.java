public class Aula07 {
    // OPERADORES LÓGICOS

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // ||
        System.out.println("a || b: " + (a || b)); // true, pois pelo menos um dos valores é verdadeiro

        // &&
        System.out.println("a && b: " + (a && b)); // false, pois ambos os valores devem ser verdadeiros
    }
}

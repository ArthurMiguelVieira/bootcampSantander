public class Aula06 {
    // OPERADORES RELACIONAIS

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // ==
        System.out.println("a == b: " + (a == b)); // false, pois 5 não é igual a 10

        // !=
        System.out.println("a != b: " + (a != b)); // true, pois 5 é diferente de 10

        // <
        System.out.println("a < b: " + (a < b)); // true, pois 5 é menor que 10

        // >
        System.out.println("a > b: " + (a > b)); // false, pois 5 não é maior que 10

        // <=
        System.out.println("a <= b: " + (a <= b)); // true, pois 5 é menor ou igual a 10

        // >=
        System.out.println("a >= b: " + (a >= b)); // false, pois 5 não é maior ou igual a 10
    }
}

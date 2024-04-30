public class aula04 {

    public static void main(String[] args) {
        int a = 10;
        int b = -5;
        boolean flag = true;

        // Operador de incremento (++)
        System.out.println("Operador de incremento:");
        System.out.println("a antes do incremento: " + a);
        System.out.println("a após o incremento: " + ++a); // Pré-incremento
        System.out.println("a após o incremento novamente: " + a++); // Pós-incremento
        System.out.println("a após o incremento final: " + a);

        // Operador de decremento (--)
        System.out.println("\nOperador de decremento:");
        System.out.println("b antes do decremento: " + b);
        System.out.println("b após o decremento: " + --b); // Pré-decremento
        System.out.println("b após o decremento novamente: " + b--); // Pós-decremento
        System.out.println("b após o decremento final: " + b);

        // Operador de positivo (+)
        System.out.println("\nOperador de positivo:");
        System.out.println("+a: " + +a);

        // Operador de negativo (-)
        System.out.println("\nOperador de negativo:");
        System.out.println("-b: " + -b);

        // Operador de negação lógica (!)
        System.out.println("\nOperador de negação lógica:");
        System.out.println("flag: " + flag);
        System.out.println("!flag: " + !flag);
    }


}

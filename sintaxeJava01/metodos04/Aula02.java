public class Aula02 {
    public static void main(String[] args) {
        // Todas as ações das aplicações são consideradas métodos.
        // Uma classe é definida por atributos e métodos.
        
        // Aqui, vamos explicar atributos e métodos:
        
        // Atributos:
        // Os atributos são características ou dados que pertencem a um objeto ou classe.
        // Eles representam o estado do objeto e são definidos na declaração da classe.
        // Exemplos de atributos podem ser: nome, idade, altura, etc.
        
        // Métodos:
        // Os métodos correspondem às funções ou sub-rotinas disponíveis dentro de nossas classes.
        // Eles representam o comportamento dos objetos e são responsáveis por realizar ações ou operações com os atributos.
        // Exemplos de métodos podem ser: calcularSalario(), realizarCompra(), etc.
        
        // Critérios de nomeação de métodos com exemplos:
        
        // 1. Os nomes de métodos devem ser descritivos e representar a ação que o método realiza.
        //    Por exemplo, se o método calcula o salário de um funcionário, ele pode ser chamado de calcularSalario().
        
        // 2. Os nomes de métodos devem começar com letra minúscula e seguir a convenção camelCase.
        //    Por exemplo, calcularSalario(), realizarCompra(), etc.
        
        // 3. Evite abreviações e nomes muito genéricos que não transmitam claramente a ação do método.
        //    Por exemplo, evite nomes como "calc()", "comp()", etc.
        
        // 4. Se o método retornar um valor, o nome deve indicar esse valor de forma clara.
        //    Por exemplo, se o método calcular o saldo de uma conta bancária, ele pode ser chamado de calcularSaldo().
        
        // Exemplos de métodos:
    
        // Chamada do método que realiza a soma de dois números inteiros
        int resultado = somar(10, 5);
        System.out.println("Resultado da soma: " + resultado);
    }
    
    // Método que realiza a soma de dois números inteiros
    public static int somar(int a, int b) {
        return a + b;
    }
}

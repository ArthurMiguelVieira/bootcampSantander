public class java03 {

    //tipo nomeBemDefinido = Atribuicao(opcional em alguns casos)

    int idade =23;
    double altura = 1.62;
    
    //declarando metodos

    //TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    static int somar(int numeroUm,int numero2){
        return numeroUm + numero2;
    }

    static String nomeCompleto(String primeiroNome,String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    
    public static void main(String[] args) {
        
        System.out.println(somar(23,23));

        System.out.println(nomeCompleto("Arthur","Miguel"));


    }

}

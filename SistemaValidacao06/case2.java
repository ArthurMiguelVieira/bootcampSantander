//Case 2: Foi solicitado, que nosso sistema garanta que, diante das inúmeras candidaturas sejam selecionados apenas no máximo,
//5 candidatos para entrevista, onde o salário pretendido seja menor ou igual ao salário base.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class case2 {
    
    public static void main(String[] args) {
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        analisarCandidato(candidatos);


    }

    static void analisarCandidato(String[] candidatos){
        String [] candidatosAceitos = new String[candidatos.length];
        int i2 =0;
        for (int i = 0; i < candidatos.length; i++) {
            double salarioPretendido = valorPretendido();
            if (salarioPretendido < 2000) {
                candidatosAceitos[i2] = candidatos[i];
                i2++;
            }
        }
        
        System.out.println(Arrays.toString(candidatosAceitos));

    }


    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}

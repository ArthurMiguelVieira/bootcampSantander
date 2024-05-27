/*Case 1: Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 e o salário pretentido pelo candidato.
Vamos elaborar um controle de fluxo onde:
- Se o valor salário base, for maior que valor salário pretentido, imprima : LIGAR PARA O CANDIDATO;
- Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
- Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.*/

public class case1{

    public static void main(String[] args) {
        analisarCandidato(2000, 1900);
    }

    static void analisarCandidato(double salarioBase,double salarioPretendido){
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }


}


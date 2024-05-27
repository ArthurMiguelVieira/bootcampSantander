import java.util.Random;
public class case4 {
    
    public static void main(String[] args) {
        // Array com a lista de candidatos

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        ligarCandidato(candidatos);
    }

    static void ligarCandidato(String[] candidatos){

        for (int i = 0; i < candidatos.length; i++) {
            for (int j = 1; j <= 3; j++) {
               boolean atendeu = atender();
               if (atendeu == true){
                System.out.println("CONSEGUIMOS CONTATO COM " + candidatos[i] +" NA " + j + " TENTATIVA");
                break;
               }else if(j == 3){
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidatos[i] +", NÚMERO MAXIMO, 3 TENTATIVAS REALIZADA");
                break;
               }
            }
            
        }
        
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}

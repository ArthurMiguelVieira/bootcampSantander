public class case3{
	
    public static void main(String[] args) {

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        imprimirCandidatos(candidatos);

    }

    static void imprimirCandidatos(String [] canditados){

        System.out.println("Imprimindo com a ordem de seleção pelo índice");
        for (int i = 0; i < canditados.length; i++) {
            System.out.println(i+"° Candidato é "+canditados[i]);
        }

        System.out.println("Imprimindo todos sem a necessidade de exibir o índice");
        for (String candidato : canditados) {
            
            System.out.println(candidato);
        }

    }

}
public class ForArrays02{
    public static void main(String[] args) {
        
        String alunos[] = {"Arthur","Joao","Maria","Vitoria"};

        // for (int i = 0; i < alunos.length; i++) {
        //     System.out.println("Aluno Numero "+i+" nome: "+alunos[i]);
        // }


        for(String aluno : alunos){
            System.out.println("Nome do aluno é "+ aluno);
        }
    }

}
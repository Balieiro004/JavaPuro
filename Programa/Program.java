import java.util.Scanner;

import escola.Aluno;
import escola.Escola;
import escola.Turma;

class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("====Escola Primaria Anderson Balieiro====");

        Escola escola = new Escola("Escola Primaria Anderson Balieiro");

        System.out.print("Informe a turma que irá digitar as notas: ");
        char turma = sc.next().charAt(0);

        int serie = solicitarSerie(sc);

        Turma novaTurma = new Turma(turma, serie);

        System.out.print("Informe a quantidade de alunos na sala: ");
        int quantidadeAlunos = sc.nextInt();

        for(int i = 0; i < quantidadeAlunos; i++){
            sc.nextLine();
            System.out.println("Nome do aluno " + (i +1) + ": ");
            String nome = sc.nextLine();
            Aluno aluno = new Aluno(nome);

            float[] notas = new float[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = sc.nextFloat();
            }
            aluno.setNota(notas);
            novaTurma.adicionarAluno(aluno);
        }
        escola.adicionarTurma(novaTurma);
        novaTurma.exibirResultadosFinais();

        sc.close();
    }
    
    // Método para solicitar e validar a série
    static int solicitarSerie(Scanner sc) {
        System.out.print("Informe a Série: ");
        int serie = sc.nextInt();
        while (serie < 1 || serie > 9) {
            System.out.println("Informe uma série valida.");
            System.out.print("Informe a Série: ");
            serie = sc.nextInt();
        }
        return serie;
    }
}

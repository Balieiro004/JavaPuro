package escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private char turma;
    private int serie;
    private List<Aluno> alunos;

    public Turma(char turma, int serie){
        this.turma = turma;
        this.serie = serie;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno Aluno){
        alunos.add(Aluno);
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }
    
    public void exibirResultadosFinais(){
        System.out.println("Resultados finais da turma " + turma + " da série " + serie + ":");
        for(Aluno aluno: alunos){
            System.out.println("Aluno: " + aluno.getNome());
            float[] notas = aluno.getNotas();
            for(int i = 0; i < notas.length; i++){
                System.out.println(String.format("Nota " + (i + 1) + ": %.1f", notas[i]));
            }
            System.out.println("Média: " + aluno.getMedia());
            aluno.exibirResultado();
            System.out.println("-----------------------");
        }
    }
}

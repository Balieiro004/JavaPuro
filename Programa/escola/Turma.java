package escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private char turma;
    private int serie;
    private List<Pessoa> alunos;

    public Turma(char turma, int serie){
        this.turma = turma;
        this.serie = serie;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Pessoa aluno){
        alunos.add(aluno);
    }

    public void exibirResultadosFinais(){
        System.out.println("Resultados finais da turma " + turma + " da série " + serie + ":");
        for(Pessoa aluno: alunos){
            aluno.exibirInformacoes();
            System.out.println("-----------------------");
        }
    }
}

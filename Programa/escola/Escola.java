package escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Turma> turmas;

    public Escola(String nome){
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }

    public void adicionarTurma(Turma turma){
        turmas.add(turma);
    }

    public List<Turma> geTurmas(){
        return turmas;
    }
}

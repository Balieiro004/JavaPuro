package escola;

public class Aluno extends Pessoa{
    private float[] notas;
    private float media;

    public Aluno(String nome){
        super(nome);
        this.notas = new float[3];
    }

    public float[] getNotas(){
        return notas;
    }
    //
    public void setNota(float[] notas){
        this.notas = notas;
        calcularMedia();
    }

    public void setNotas(float nota1, float nota2, float nota3){
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        calcularMedia();
    }
    //
    public float getMedia(){
        return media;
    }

    private void calcularMedia(){
        float soma = 0;
        for(float nota: notas){
            soma += nota;
        }
        this.media = soma / notas.length;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Aluno: " + getNome());
        for (int i = 0; i < notas.length; i++) {
            System.out.println(String.format("Nota " + (i + 1) + ": %.1f", notas[i]));
        }
        System.out.println("Média: " + media);
        if (media >= 6) {
            System.out.println(String.format("%s, parabéns você passou :), sua média é: %.1f", getNome(), media));
        } else {
            System.out.println(String.format("%s, você está de recuperação :(, sua média é: %.1f", getNome(), media));
        }
    }
}

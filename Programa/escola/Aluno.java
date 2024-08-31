package escola;

public class Aluno {
    private String nome;
    private float[] notas;
    private float media;

    public Aluno(String nome){
        this.nome = nome;
        this.notas = new float[3];
    }
    //
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    //
    public float[] getNotas(){
        return notas;
    }
    //
    public void setNota(float[] notas){
        this.notas = notas;
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

    public void exibirResultado(){
        if (media >= 6) {
            System.out.println(String.format("%s, parabéns você passou :), sua média é: %.1f", nome, media));
        }else{
            System.out.println(String.format("%s, você está de recuperação :(, sua média é: %.1f", nome, media));
        }
    }
}

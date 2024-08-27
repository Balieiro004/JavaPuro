import java.util.Scanner;

class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int quantidadeDeNotasBimestrais = 3;
        String[] nomeAlunos;
        float[][] notas;
        float[] media;
        System.out.println("====Escola Primaria Anderson Balieiro====");

        char turma = solicitarTurma(sc);
        int serie = solicitarSerie(sc);

        while (serie < 1 || serie > 9) {
            System.out.println("Informe uma série valida.");
            serie = solicitarSerie(sc);
        }

        int quantidadeAlunos = solicitarQuantidadeAlunos(sc);
        nomeAlunos = new String[quantidadeAlunos];
        notas = new float[quantidadeAlunos][quantidadeDeNotasBimestrais];
        media = new float[quantidadeAlunos];

        for(int cont = 0; cont < quantidadeAlunos; cont++){
            nomeAlunos[cont] = solicitarNomeAluno(sc, cont);
            media[cont] = calcularMediaAluno(sc, notas[cont]);
            exibirResultadoAluno(nomeAlunos[cont], media[cont]);
            
        }

        exibirResultadosFinais(nomeAlunos, notas, media);

        sc.close();
    }

    // Método para solicitar a turma
    static char solicitarTurma(Scanner sc) {
        System.out.print("Informe a turma que irá digitar as notas: ");
        return sc.next().charAt(0);
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

    // Método para solicitar a quantidade de alunos
    static int solicitarQuantidadeAlunos(Scanner sc) {
        System.out.print("Informe a quantidade de alunos na sala: ");
        return sc.nextInt();
    }

    // Método para solicitar o nome do aluno
    static String solicitarNomeAluno(Scanner sc, int indice) {
        sc.nextLine(); // Consumir a quebra de linha
        System.out.println("=========================");
        System.out.print("Nome do aluno " + (indice + 1) + ": ");
        return sc.nextLine();
    }

    // Método para calcular a média de um aluno
    static float calcularMediaAluno(Scanner sc, float[] notas) {
        float somaNotas = 0;
        for (int j = 0; j < 3; j++) {
            System.out.print("Nota " + (j + 1) + ": ");
            notas[j] = sc.nextFloat();
            somaNotas += notas[j];
        }
        return somaNotas / 3;
    }

    // Método para exibir o resultado de um aluno
    static void exibirResultadoAluno(String nome, float media) {
        if (media >= 6) {
            System.out.println(String.format("%s, parabéns você passou :), sua média é: %.1f", nome, media));
        } else {
            System.out.println(String.format("%s, você está de recuperação :(, sua média é: %.1f", nome, media));
        }
    }

    // Método para exibir os resultados finais
    static void exibirResultadosFinais(String[] nomeAlunos, float[][] notas, float[] media) {
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        for (int i = 0; i < nomeAlunos.length; i++) {
            System.out.println(String.format("Aluno: %s", nomeAlunos[i]));
            for (int j = 0; j < 3; j++) {
                System.out.println(String.format("Nota " + (j + 1) + ": %.1f", notas[i][j]));
            }
            System.out.println("Média: " + media[i]);
        }
    }
}

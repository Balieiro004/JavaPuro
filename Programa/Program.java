import java.util.Scanner;

class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int quantidadeDeNotasBimestrais = 3;
        String[] nomeAlunos;
        float[][] notas;
        float[] media;
        System.out.println("====Escola Primaria Anderson Balieiro====");

        System.out.print("Informe a turma que irá digitar as notas: ");
        char turma = sc.next().charAt(0);

        System.out.print("Informe a Série: ");
        int serie = sc.nextInt();

        while (serie < 1 || serie > 9) {
            System.out.println("Informe uma série valida.");
            System.out.print("Informe a Série: ");
            serie = sc.nextInt();
        }

        System.out.print("Informe a quantidade de alunos na sala:");
        int quantidadeAlunos = sc.nextInt();
        nomeAlunos = new String[quantidadeAlunos];
        notas = new float[quantidadeAlunos][quantidadeDeNotasBimestrais];
        media = new float[quantidadeAlunos];

        for(int cont = 0; cont < quantidadeAlunos; cont++){
            System.out.println("=========================");
            sc.nextLine();
            System.out.print("Nome: ");
            nomeAlunos[cont] = sc.nextLine();

            float somaNotas = 0;
            for(int contNota = 0; contNota < quantidadeDeNotasBimestrais; contNota++){

                System.out.print("Nota " + (contNota+1) + ": ");
                notas[cont][contNota] = sc.nextFloat();
    
                somaNotas += notas[cont][contNota];
            }

            media[cont] = somaNotas / 3 ;
            if (media[cont] >= 6) {
                System.out.println(String.format("%s parabéns você passou :), sua média é: %.1f", nomeAlunos[cont], media[cont]));
            }else{
                System.out.println(String.format("%s você está de recuperação :(, sua média é: %.1f", nomeAlunos[cont], media[cont]));
            }
            
        }

        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        for(int cont = 0; cont < quantidadeAlunos; cont++){
            System.out.println(String.format("Aluno: %s", nomeAlunos[cont]));

            for(int contNota = 0; contNota < quantidadeDeNotasBimestrais; contNota++){
                System.out.println(String.format("Nota " + (contNota+1) +": %.1f", notas[cont][contNota]));
            }            
            
            System.out.println("Media: " + media[cont]);
        }

        sc.close();
    }
}

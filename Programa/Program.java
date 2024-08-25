import java.util.Scanner;

class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] nomeAlunos;
        float[] notas = new float[3];
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
        media = new float[quantidadeAlunos];

        for(int cont = 0; cont < quantidadeAlunos; cont++){
            System.out.println("=========================");
            sc.nextLine();
            System.out.print("Nome: ");
            nomeAlunos[cont] = sc.nextLine();

            float somaNotas = 0;
            for(int contNota = 0; contNota < notas.length; contNota++){

                System.out.print("Nota " + (contNota+1) + ": ");
                notas[contNota] = sc.nextFloat();
    
                somaNotas += notas[contNota];
            }

            media[cont] = somaNotas / 3 ;
            if (media[cont] >= 6) {
                System.out.println(String.format("%s parabéns você passou :), sua média é: %.1f", nomeAlunos[cont], media[cont]));
            }else{
                System.out.println(String.format("%s você está de recuperação :(, sua média é: %.1f", nomeAlunos[cont], media[cont]));
            }
            
        }

        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        for(String nomes: nomeAlunos){
            System.out.println(String.format("Aluno: %s", nomes));

            int contMais = 0;
            for(float nota: notas){
                System.out.println(String.format("nota " + (contMais+1) +": %.1f", nota));
                contMais++;
            }
            
            int contMedia =0;
            System.out.println("Media: " + media[contMedia]);
            contMedia++;
        }

        sc.close();
    }
}

import java.util.Scanner;

class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

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

        for(int cont = 1; cont <= quantidadeAlunos; cont++){
            System.out.println("=========================");
            sc.nextLine();
            System.out.print("Nome: ");
            String nomeAluno = sc.nextLine();

            System.out.print("Nota 1: ");
            int notaUm = sc.nextInt();

            System.out.print("Nota 2: ");
            int notaDois = sc.nextInt();

            System.out.print("Nota 3: ");
            int notaTres = sc.nextInt();

            float mediaNota = (notaUm + notaDois + notaTres) / 3;

            if (mediaNota >= 6) {
                System.out.println(String.format("%s parabéns você passou :), sua média é: %.1f", nomeAluno, mediaNota));
            }else{
                System.out.println(String.format("%s você está de recuperação :(, sua média é: %.1f", nomeAluno, mediaNota));
            }
            
        }

        sc.close();
    }
}

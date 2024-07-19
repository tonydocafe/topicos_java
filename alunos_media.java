import java.util.Scanner;

public class alunos_media{
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o número de estudantes na turma: ");
        int numeroEstudantes = entrada.nextInt();
        
        
        double somaMedias = 0;


        for (int i = 0; i < numeroEstudantes; i++) {
            
            entrada.nextLine();

            
            System.out.print("Digite o nome do estudante: ");
            String nome = entrada.nextLine();

            
            System.out.print("Digite a nota da prova I: ");
            double nota1 = entrada.nextDouble();

            System.out.print("Digite a nota da prova II: ");
            double nota2 = entrada.nextDouble();

            System.out.print("Digite a nota da prova III: ");
            double nota3 = entrada.nextDouble();

           
            double media = (nota1 + nota2 + nota3) / 3;

            
            somaMedias += media;

            
            System.out.println("A média do estudante " + nome + " é: " + media);
        }

        
        double mediaTurma = somaMedias / numeroEstudantes;

        
        System.out.println("A média da turma é: " + mediaTurma);

        
        entrada.close();
    }
}

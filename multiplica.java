import java.util.Scanner;

public class multiplica {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        
        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        
        int resultado = numero1 * numero2;

     
        System.out.println("O resultado da multiplicação é: " + resultado);

        entrada.close();
    }
}
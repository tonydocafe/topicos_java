import java.util.Scanner;

public class celsius_fahrenheit {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius =entrada.nextDouble();

        
        double fahrenheit = (celsius * 9 / 5) + 32;

        
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
       
       entrada.close();
    }
}

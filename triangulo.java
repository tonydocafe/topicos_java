import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

       
        System.out.print("Digite o lado a do triângulo: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o lado b do triângulo: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o lado c do triângulo: ");
        double c = entrada.nextDouble();

        
        double s = (a + b + c) / 2;

        
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        
        System.out.println("A área do triângulo é: " + area);
        
      
        entrada.close();
    }
}

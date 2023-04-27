import java.util.Scanner;

public class Exercicio04{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        System.out.println("Indique um valor do raio de um circulo ou esfera:");
        double raio = scanner.nextDouble();

        switch (num){
            case 1:
            double perimetro = 2 * Math.PI * raio;
            System.out.println("O valor do perimetro é: " + perimetro);
            break;
        }
        switch (num){
            case 2:
            double area = Math.PI * (Math.pow (raio,2));
            System.out.println("A area do circulo é: " + area);
            break;
        }
        switch (num){
            case 3:
            double volume = (4/3 * Math.PI * Math.pow (raio,3));
            System.out.println("O volume da esfera é: " + volume);
        default:
        System.out.println("O código da operação é inválido");
        break;
    }
    scanner.close();
    }
}
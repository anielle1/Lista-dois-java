import java.util.Scanner;
import java.util.Random;

public class Exercicio06{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.println("Digite um numero: ");
        int numero2 = scanner.nextInt();

        
        System.out.println("Numero sorteado: " + (gerador.nextInt(numero - numero2 + 1) + numero));
        scanner.close();
    }
}
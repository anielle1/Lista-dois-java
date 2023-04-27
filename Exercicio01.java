import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args) {
        
        double n1, n2, n3, m ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite um numero: ");
        n2 = scanner.nextDouble();

        System.out.println("Digite um numero: ");
        n3 = scanner.nextDouble();

        if(n1 > n2) {   
            System.out.println("O numero maior é : "+ n1);
        }
         else if (n2 > n3) {
            System.out.println("O numero maior é:" + n2);
        }
         else if (n1 > n3) {
            System.out.println("O numero maior é: " + n1);
        }
        if (n1 < n2){
            System.out.println("O numero menor é: " + n1);
        }
        else if (n2 < n3){
            System.out.println("O menor numero é: " + n2);
        }
        else (n1 < n3) {
            System.out.println("O numero menor é: " + n1);
        }
        double media = ((media = n1+n2+n3)/2);
        System.out.println("A media Aritmetica dos tres numeros é: " + media);
        scanner.close();

        }

    }

import java.util.Scanner;

public class Exercicio05{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um numero real:");
        double numero = scanner.nextDouble();

        System.out.println("Escreva um numero real: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escreva um simbolo de operação: ");
         String simbolo = scanner.next();

        switch (simbolo){
            case "+" :
            double adicao = numero + numero2;
            System.out.println("O valor da operação é: " + adicao);
            break;
        
            case "-":
            double subtracao = numero - numero2;
            System.out.println("O valor da operação é: " + subtracao);
            break;
        
        
            case "*":
            double multiplicacao = numero * numero2;
            System.out.println("O valor da operação é: " + multiplicacao);
            break;
        
        
            case "/":
            double divisao = numero / numero2;
            System.out.println("O valor da operação é: " + divisao);
            break;
        
        
            case "^":
            double potenciacao =  Math.pow(numero, numero2);
            System.out.println("O valor da operação é: " + potenciacao);
            
            default:
            System.out.println("O símbolo da operação é inválido");
        }
        scanner.close();
            
    }
}
import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi o valor da compra? ");
        double vc = scanner.nextDouble();

        System.out.println("Qual foi o valor pago? ");
        double vp = scanner.nextDouble();

        if (vc > vp){
          System.out.println("A quantia paga é insuficiente para pagar as compras!");
        }
        double troco = (vp - vc);
        int notas50 = 0;
        while (troco >= 50){
        notas50++;
        troco -= 50;
    }
        int notas20 = 0;
        while (troco >= 20){
        notas20++;
        troco -= 20;
        }
        int notas10 = 0;
        while (troco >= 10){
        notas10++;
        troco -= 10;
        }
        int notas5 = 0;
        while(troco >= 5){
        notas5++;
        troco -= 5;
        }
        int notas2 = 0;
        while(troco >= 2){
        notas2++;
        troco -= 2;
        }
        int notas1 = 0;
        while(troco >= 1){
        notas1++;
        troco -= 1;
        }
        System.out.println("Moedas de um real: " + notas1);
        System.out.println("Notas de dois reais: " + notas2);
        System.out.println("Notas de cinco reais: " + notas5);
        System.out.println("Notas de dez reais: " + notas10);
        System.out.println("Notas de vinte reais: " + notas20);
        System.out.println("Notas de cinquenta reais: " + notas50);
        System.out.println("O troco é de: " + (vp-vc));
        
        scanner.close();





    
    }
}
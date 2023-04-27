import java.util.Scanner;

public class Exercicio03{
 public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o valor de A: ");
    Double valorA = scanner.nextDouble();

    System.out.println("Qual o valor de B: ");
    Double valorB = scanner.nextDouble();

    System.out.println("Qual o valor de C: ");
    Double valorC = scanner.nextDouble();

    double valorD = Math.pow(valorB, 2) - ( 4 * valorA * valorC);
    if (valorA == 0 && valorB == 0 && valorC != 0 ){
    System.out.println("Coeficientes informados incorretamentes!");
    }
     else if(valorA == 0 && valorB != 0){
      System.out.println("Essa é uma equação de primeiro grau!");
     double x1 = (-valorB / valorA);
     }
     else if (valorD <0){
      System.out.println("Essa equação não possui raízes reais!");
     }
     else if (valorD == 0){
      System.out.println("Esta equação possui duas raízes reais iguais! ");
     }
     else if (valorD > 0){
      System.out.println("Essa equação possui raízes reais diferentes!");
     double x1 = (-valorB + Math.pow(valorD,2)) / 2 * valorA;
     double x2 = (-valorB - Math.pow(valorD,2)) / 2 * valorA;
     System.out.println("O valor das raízes são: " + x1 + " " +  x2);

    scanner.close();

     }
       

    }


 }


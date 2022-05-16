import java.util.Scanner;
import java.io.*;

public class Calculadora {
    public static void main(String [] args){
        int op = 0;

        float n1, n2 ;

        Scanner ler = new Scanner(System.in);
        n1 = ler.nextFloat();
        n2 = ler.nextFloat();
        op = ler.nextInt();


        switch (op) {
            case 1:
                System.out.println("Resultado" + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado" + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado" + (n1 * n2));
                break;
            case 4:
                System.out.println("Resultado" + (n1 / n2));
                break;
            case 5:
                break;
            default:
                System.out.println("Digite uma opção valida!");
                break;
        }
    }
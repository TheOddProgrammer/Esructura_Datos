package primos;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean band = false;
        
        System.out.print("Ingrese el Numero:");
        int num = sc.nextInt();
        
        for (int i = num-1; i >= 2; i--) {
            if (num%i==0) {
                band = true;
                break;
            }
        }
        
        if (band) {
            System.out.println("No es Primo");
        } else {
            System.out.println("Es Primo");
        }
    }
}

//Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos
// junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        int numerosArray[] = new int[10];


        int max = 0;
        int min = 2147483647;

        for (int i = 0; i< numerosArray.length; i++) {
            System.out.println("Introduzca 10 numeros");
            numerosArray[i] = sc.nextInt();
        }
        for (int i = 0; i< numerosArray.length;i++){
            System.out.println(numerosArray[i]);

        }
        for (int i = 0; i< numerosArray.length;i++){
            if(numerosArray[i]>max){
                numerosArray[i]=max;
                System.out.println(numerosArray[i]);
            }
            if(numerosArray[i]<min){
                numerosArray[i]=min;
                System.out.println(numerosArray[i]);
            }
        }


    }

}


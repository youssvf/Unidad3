//Escribe un programa que lea 10 números por teclado y luego los muestre en orden inverso, es decir,
//el primero que se introduce es el último en mostrarse y viceversa.


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [10];

        System.out.println("Introduzca 10 numeros separados por espacio");

        for(int i = 0;i < 10; i++){

            numeros [i] = sc.nextInt();
        }
        for(int i =9; i >=0;i--){
            System.out.println(numeros[i]);
        }


    }
}

//Implementa un programa que pida al usuario las calificaciones (double) de los 10 estudiantes de una clase y los guarde en un array.
// Después, mostrará esas calificaciones (cada una en una línea), seguida de la media del curso y del número de aprobados y suspensos.
// Se usará un método para calcular la nota media y otro para el número de suspensos.

import java.util.Scanner;

public class Ejercicio8 {

    public static void main (String args[]){

        double[] notas = new double[10];
        double NotaMedia;
        PideNotas(notas);

        MuestraArray(notas);
        CalculaMedia(notas);
        AprobadosSuspensos(notas);

    }
    public static void PideNotas(double[] notas){

        for(int i = 0;i< notas.length;i++){
            Scanner sc= new Scanner(System.in);
            System.out.println("introduzca las notas del alumno " + (i+1) +" : ");
            notas[i]= sc.nextDouble();
        }
    }
    public static double CalculaMedia(double[] notas){
        double NotaTotal= 0;
        double NotaMedia=0;
        for(double i :notas){
            NotaTotal= i + NotaTotal;
        }
        NotaMedia = NotaTotal/10;
        return NotaMedia;
    }
    public static void AprobadosSuspensos(double[] notas){
        int aprobados = 0;
        int suspensos = 0;
        for( int i = 0; i< notas.length; i++){
            if(notas[i]>=5){
                aprobados++;
            } else if (notas[i]<=5) {
                suspensos++;
            }
        }
        System.out.println("Número de aprobados : " + aprobados + "\n" + "Número de Suspensos : " + suspensos);
    }
    public static void MuestraArray(double[] notas){
        for (int i=0;i< notas.length;i++){
            System.out.printf("La nota del alumno %d es: %.2f, la media es : %.2f",(i+1),notas[i]);
            System.out.println(i++);
        }

    }
//f
}

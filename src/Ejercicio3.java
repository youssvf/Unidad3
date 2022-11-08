//Crea un programa que permita almacenar en un array un conjunto de 20 números enteros de valores comprendidos
// entre 0 y 99 generados aleatoriamente (utiliza el método Math.random()).



public class Ejercicio3 {

    public static void main(String[] args) {

        int[] numerosArray = new int[20];

        for (int i = 0; i < 20; i++) {
            numerosArray[i] = (int) (Math.random() * 99);
        }

        for (int i = 0; i < numerosArray.length; i++) {
            System.out.println(numerosArray[i]);
        }

    }

}

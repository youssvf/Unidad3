//Define tres arrays de 20 números enteros cada uno, con nombres: numero, cuadrado y cubo.
// Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
// En el array cubo se deben almacenar los cubos de los valores que hay en numero. A continuación se muestra el contenido de los tres arrays dispuestos en tres columnas.


public class Ejercicio5 {

    public static void main(String[] args) {

        int[] numeroArray = new int[20];

        for (int i = 0; i < 20; i++) {
            numeroArray[i] = (int) (Math.random() * 100);
        }
        System.out.println("Los numeros son: ");

        for (int i = 0; i < numeroArray.length; i++) {
            System.out.println( + numeroArray[i]);
        }

        int[] cuadradoArray = new int[20];
        System.out.println("Sus cuadrados son:");
        for (int i = 0; i < cuadradoArray.length; i++) {

            System.out.println(numeroArray[i]*numeroArray[i]);
        }
        System.out.println("Sus cubos son: ");
        int[] cuboArray = new int[20];

        for (int i = 0; i < cuboArray.length; i++) {
            System.out.println( numeroArray[i]*numeroArray[i]);
        }

    }

}

//Define un array de 10 caracteres y asigna los valores a los elementos según la tabla que se muestra a continuación.
// Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?.
// Indica la respuesta en forma de comentario.


public class Ejercicio4 {

    public static void main ( String args[]){

        char [] caracteresArray = new char[10] ;

        caracteresArray[0] = 'a';
        caracteresArray[1] = 'x';
        caracteresArray[4] = '@';
        caracteresArray[6] = ' ';
        caracteresArray[7] = '+';
        caracteresArray[8] = 'Q';

        for(int i = 0 ; i < caracteresArray.length ; i++){
            System.out.println(caracteresArray[i]);
        }
    }
}

//Las posiciones del array que no tienen nada asignado se muestra como un conjunto vacío.

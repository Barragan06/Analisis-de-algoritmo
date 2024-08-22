
package numero_perfecto;


public class Numero_Perfecto {

    
    public static boolean esPerfecto(int numero) {

        int divisoresNumero = 0;

        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {

                divisoresNumero += i;

            }

        }

        return divisoresNumero == numero;
    }

    public static void main(String[] args) {

        int numero = 60;
        
        long startTime = System.nanoTime();

        if (numero <= 0) {

            System.out.println(" Ingres un valor valido ");

        }

        if (esPerfecto(numero)) {

            System.out.println(" Es un numero perfec mi sog " + numero);

        } else {
            System.out.println(" Lo siento mi sog no es perfect ");
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos ");
    }

}



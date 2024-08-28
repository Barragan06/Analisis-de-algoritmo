package matrizmxm;

import java.util.Random;

public class MatrizMxM {

    public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
        int m =500;
        int[][] matriz = new int[m][m];

        Random aleatorio = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;
            }
        }   
        System.out.println("Matriz " + m + " x " + m + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] );
            }
            System.out.println();
        }
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
        System.out.println("Tiempo de respuesta : "+duration);
    }
}

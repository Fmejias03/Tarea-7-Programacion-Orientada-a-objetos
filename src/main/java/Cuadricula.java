import java.util.Random;
import java.util.Scanner;

public class Cuadricula {
    public int[][] tabla;
    public boolean[][] barcos;
    public static int TAMANIO = 10;
    public static int NUM_BARCOS = 5;
    public static int MAX_INTENTOS = 50;

    public Cuadricula() {
        tabla = new int[TAMANIO][TAMANIO];
        barcos = new boolean[TAMANIO][TAMANIO];
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                tabla[i][j] = 0;  // 0 representa agua
                barcos[i][j] = false;
            }
        }
    }

    public void depositarBarco(int fila, int columna) {
        if (barcos[fila][columna]) {
            System.out.println("Ya hay un barco en esa posición");
        } else {
            barcos[fila][columna] = true;
        }
    }

    public boolean disparar(int fila, int columna) {
        if (barcos[fila][columna]) {
            tabla[fila][columna] = 1;  // 1 representa barco hundido
            barcos[fila][columna] = false;
            return true;
        } else {
            tabla[fila][columna] = -1;  // -1 representa agua disparada
            return false;
        }
    }

    public void visualizacion() {
        System.out.print("  ");
        for (int i = 0; i < TAMANIO; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < TAMANIO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMANIO; j++) {
                if (tabla[i][j] == 0) {  // agua
                    System.out.print("~ ");
                } else if (tabla[i][j] == -1) {  // agua disparada
                    System.out.print(". ");
                } else {  // barco hundido
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public boolean todosHundidos() {
        for (int i = 0; i < TAMANIO; i++) {
            for (int j = 0; j < TAMANIO; j++) {
                if (barcos[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


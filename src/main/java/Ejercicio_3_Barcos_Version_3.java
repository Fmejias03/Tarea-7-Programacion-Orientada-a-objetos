import java.util.Random;
import java.util.Scanner;

public class Ejercicio_3_Barcos_Version_3 {
    public static void main(String[] args) {
        Cuadricula cuadricula = new Cuadricula();
        Random random = new Random();
        System.out.println("Bienvenido a la micro guerra de barcos");
        System.out.println("Hay " + Cuadricula.NUM_BARCOS + " barcos escondidos en el tablero");
        System.out.println("Intente hundir todos los barcos en menos de " + Cuadricula.MAX_INTENTOS + " intentos");
        for (int i = 0; i < Cuadricula.NUM_BARCOS; i++) {
            int fila, columna;
            do {
                fila = random.nextInt(Cuadricula.TAMANIO);
                columna = random.nextInt(Cuadricula.TAMANIO);
            } while (cuadricula.barcos[fila][columna]);  // si ya hay un barco, elegir otra posición
            cuadricula.depositarBarco(fila, columna);
        }
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);
        while (intentos < Cuadricula.MAX_INTENTOS) {
            System.out.println("Intento n.°" + (intentos + 1));
            System.out.print("Fila: ");
            int fila = scanner.nextInt();
            System.out.print("Columna: ");
            int columna = scanner.nextInt();
            if (cuadricula.disparar(fila, columna)) {
                System.out.println("¡Le pegaste a un barco!");
            } else {
                System.out.println("Agua");
            }
            cuadricula.visualizacion();
            intentos++;
            if (cuadricula.todosHundidos()) {
                System.out.println("¡Ganaste!");
                break;
            }
    }   if (intentos == Cuadricula.MAX_INTENTOS) {
            System.out.println("¡Perdiste!");
        }



    }

}


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_2 {
    /*Para las necesidades de un sitio de venta online de libros de informática, ediciones ENI por ejemplo, se pide crear una clase que permita modelizar a un cliente. Todos los clientes tienen un nombre y se les debe asignar un número de cliente. También se pide escribir un algoritmo de prueba para capturar y mostrar clientes.

Ejemplo de ejecución posible:

-- Menú --

1 - Mostrar clientes

2 - Crear un cliente

3 - Salir

2

¿Nombre?

Francisco GONZALEZ

Cliente n.°1 [Francisco GONZALEZ] añadido

-- Menú --

1 - Mostrar clientes

2 - Crear un cliente

3 - Salir

2

¿Nombre?

Carlota OLIVERA

Cliente n.°2 [Carlota OLIVERA] añadido

-- Menú --

1 - Mostrar clientes

2 - Crear un cliente

3 - Salir

1

-- Clientes --

Cliente n.°1 [Francisco GONZALEZ]

Cliente n.°2 [Carlota OLIVERA]

-- Menú --

1 - Mostrar clientes

2 - Crear un cliente

3 - Salir

3*/

    private static int ultimoNumeroCliente = 0;

    private String nombre;
    private int numeroCliente;

    public Ejercicio_2(String nombre) {
        this.nombre = nombre;
        this.numeroCliente = ++ultimoNumeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public String toString() {
        return "Cliente n.°" + numeroCliente + " [" + nombre + "]";
    }

    public static void main(String[] args) {
        ArrayList<Ejercicio_2> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("-- Menú --\n");
            System.out.println("1 - Mostrar clientes");
            System.out.println("2 - Crear un cliente");
            System.out.println("3 - Salir\n");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n-- Clientes --\n");
                    for (Ejercicio_2 cliente : clientes) {
                        System.out.println(cliente);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("\n¿Nombre? ");
                    String nombre = scanner.nextLine();

                    Ejercicio_2 cliente = new Ejercicio_2(nombre);
                    clientes.add(cliente);
                    System.out.println("Cliente n.°" + cliente.getNumeroCliente() + " [" + cliente.getNombre() + "] añadido\n");
                    break;
                case 3:
                    System.out.println("\n¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción inválida\n");
            }
        }

        scanner.close();
    }
}


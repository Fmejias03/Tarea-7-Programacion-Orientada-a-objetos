public class Ejercicio_1 {
    /*Crea una clase modelizando un dado para jugar. Esta clase tiene:

dos atributos de instancia: uno que permite conocer el número de caras que tiene el dado y otro para almacenar la última cara que se extrajo;

dos constructores: uno que recibe como argumento el número de caras para el dado a crear y el otro, sin argumentos, que crea un clásico dado de seis caras;

métodos getter para los dos atributos;

un método setter, solo para cambiar el número de caras;

un método de instancia que permite simular la tirada de los dados, devolviendo el valor extraído aleatoriamente por los dados.

Escribir un algoritmo principal usando esta clase para crear tres dados: uno tiene seis caras, otro tiene diez caras y el último tiene doce caras. Los tres dados se lanzan hasta que la suma de los dados sea mayor o igual a veinte.*/

    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado(10);
        Dado d3 = new Dado(12);
        int suma = 0;

        while (suma < 20) {
            suma = d1.lanzar() + d2.lanzar() + d3.lanzar();
            System.out.println("Suma: " + suma);
        }
    }
}


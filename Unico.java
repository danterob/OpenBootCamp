public class Unico {

    public static void main (String []args) {
        int suma;
        sumar miSuma;
        miSuma = new sumar();

        System.out.println("Resultado: " + miSuma.suma( 1, 30, 55));

        coche miCoche;
        int puertas = 0;
        miCoche = new coche();
        System.out.println("El coche tiene " + miCoche.numPuertas + " puertas.");
        puertas = miCoche.addPuerta();
        System.out.println("El numero de puertas ahora es: " + puertas);
    }

    public int suma ( int a, int b, int c) {
        return a + b + c;
    }

}

class coche {

    int numPuertas = 2;

    public int addPuerta () {
        return ++numPuertas;
    }
}

 public class coche {

    int numPuertas = 2;

    public int addPuerta () {
        return ++numPuertas;
    }

    public static void main (String []args){
        coche miCoche;
        int puertas = 0;
        miCoche = new coche();
        System.out.println("El coche tiene " + miCoche.numPuertas + " puertas.");
        puertas = miCoche.addPuerta();
        System.out.println("El numero de puertas ahora es: " + puertas);
    }
}
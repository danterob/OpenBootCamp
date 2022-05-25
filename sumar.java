public class sumar {

    public int suma ( int a, int b, int c) {
        return a + b + c;
    }

    public static void main (String []args) {
        int suma;
        sumar miSuma;
        miSuma = new sumar();

      //  suma = miSuma.suma( 1, 30, 55);

        System.out.println("Resultado: " + miSuma.suma( 1, 30, 55));
    }
}

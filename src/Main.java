
public class Main {

    static class Coche {
        int puertas_coche;

        void añadirpuertas(int aux) {
            puertas_coche = aux;
        }
    }

    public static void main(String[] args) {
        int resultado = suma(3, 6, 4);
        System.out.println( "El resultado de la suma es: "+resultado);

    Coche micoche = new Coche();
        micoche.añadirpuertas(4);
        System.out.println("\nEl coche tiene "+micoche.puertas_coche+" puertas");
    }

    public static int suma(int a,int b,int c){

        return a+b+c;
    }
}
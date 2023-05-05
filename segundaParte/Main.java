package segundaParte;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche(3);
        coche.agregarPuertas(1);
        System.out.println("El coche tiene " + coche.getNumeroPuertas() + " de puertas");
    }
}

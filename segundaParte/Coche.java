package segundaParte;

public class Coche {
    private int numeroPuertas = 0;

    public Coche(int numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public void agregarPuertas(int cantidadDePuertas){
        numeroPuertas += cantidadDePuertas;
    }
}

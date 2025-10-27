public class EjemploValores {

    // Metodo por valor
    public static void cambiarNumero(int n) {
        n = 10; // solo cambia la copia local del valor
        System.out.println("Dentro de cambiarNumero: n = " + n);
    }

    // Clase  usar un objeto
    static class Caja {
        int valor;
    }

    // Metodo con paso por referencia (usa un objeto)
    public static void cambiarCaja(Caja c) {
        c.valor = 10; // cambia el valor dentro del mismo objeto
        System.out.println("Dentro de cambiarCaja: c.valor = " + c.valor);
    }

    public static void main(String[] args) {

        // ---------- Paso por valor ----------
        int numero = 5;
        System.out.println("Antes de cambiarNumero: numero = " + numero);
        cambiarNumero(numero);
        System.out.println("Después de cambiarNumero: numero = " + numero);
        System.out.println(); // salto de línea

        // ---------- Paso por referencia ----------
        Caja miCaja = new Caja();
        miCaja.valor = 5;
        System.out.println("Antes de cambiarCaja: miCaja.valor = " + miCaja.valor);
        cambiarCaja(miCaja);
        System.out.println("Después de cambiarCaja: miCaja.valor = " + miCaja.valor);
    }
}

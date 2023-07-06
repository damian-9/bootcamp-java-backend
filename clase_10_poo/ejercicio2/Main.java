package clase_10_poo.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();

        //cuenta1.setTitular("Damian");
        //cuenta1.setCantidad(31879.78f);
        //cuenta1.mostrar();
        cuenta1.setTitular("Damian");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Cantidad a ingresar: $");
        float cantidadAIntroducir = teclado.nextFloat();
        cuenta1.ingresarCantidad(cantidadAIntroducir);

        //cuenta1.mostrar();

        System.out.print("Cantidad a retirar: $");
        float cantidadARetirar = teclado.nextFloat();
        cuenta1.retirarCantidad(cantidadARetirar);

        cuenta1.mostrar();
    }
}

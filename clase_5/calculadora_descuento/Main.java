package clase_5.calculadora_descuento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = entrada.nextDouble();
        System.out.print("Ingrese porcentaje de descuento: ");
        double porcentajeDescuento = entrada.nextDouble();
        double precioFinal;

        precioFinal = precio - ((precio / 100) * porcentajeDescuento);

        System.out.println("El precio final de su producto es: "+ precioFinal);

    }
}

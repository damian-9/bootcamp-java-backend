package clase_5.calculadora_propinas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el total de su cuenta: ");
        double totalCuenta = entrada.nextDouble();
        System.out.print("Ingrese el porcentaje de propina que desee dejar: ");
        double porcentajePropina = entrada.nextDouble();
        double montoPropina;

        montoPropina = (totalCuenta / 100) * porcentajePropina;

        System.out.println("El monto de su propina es: " + montoPropina);
    }
}

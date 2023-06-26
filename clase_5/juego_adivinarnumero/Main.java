package clase_5.juego_adivinarnumero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroIngresado, numeroAdivinar;
        numeroAdivinar = (int) (Math.random()*100);

        //System.out.println("El numero aleatorio es: " + numeroAdivinar);
        System.out.println("JUEGO ADIVINAR NUMERO");

        System.out.print("Ingrese un numero entre 1 y 100: ");

        do {
            numeroIngresado = entrada.nextInt();

            if (numeroIngresado > numeroAdivinar){
                System.out.print("Numero equivocado, ingrese un numero menor: ");
            } else if (numeroIngresado < numeroAdivinar) {
                System.out.print("Numero equivocado, ingrese un numero mayor: ");
            }
        } while (numeroIngresado != numeroAdivinar);

        System.out.println("FELICIDADES HAZ ADIVINADO EL NUMERO");

    }

}

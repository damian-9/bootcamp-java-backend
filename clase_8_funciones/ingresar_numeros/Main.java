package clase_8_funciones.ingresar_numeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        int[] numeros = new  int[5];

        cargarNumeros(numeros);
        mostrarNumeros(numeros);
    }

    private static void cargarNumeros(int[] numeros) {
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = pedirNumero();
        }
    }

    public static void mostrarNumeros(int[] numeros){
        System.out.println("Los numeros son: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = teclado.nextInt();
        return numero;
    }
}

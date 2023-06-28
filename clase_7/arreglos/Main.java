package clase_7.arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new  int[5];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingresa un número: ");
            numeros[i] = teclado.nextInt();
        }//System.out.println("Los numeros son:   " + Arrays.toString(numeros));

        System.out.println("Los números que ingresó, son: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
        }

        //Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

        int mayor = 0;
        int menor = 0;
        for(int i = 0; i < numeros.length; i++){
            int num = numeros[i];

            if(num > mayor || i == 0){
                mayor = num;
            }
            if (num < menor || i == 0) {
                menor = num;
            }
        }
        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        //Ahora, hay que mostrar el promedio.
        // Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.

        int suma = 0;
        float promedio;
        for(int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
        }
        promedio = (float) suma / numeros.length;
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio de los numeros es: " + promedio);
    }
}

package clase_10_poo.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();

        ingresarDatos(persona1);

        System.out.println(persona1);
        //System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad());

    }

    private static Persona ingresarDatos(Persona persona) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su ID: ");
        persona.setId(teclado.nextInt());

        System.out.print("Ingrese su nombre: ");
        persona.setNombre(teclado.next());

        System.out.print("Ingrese su edad: ");
        persona.setEdad(teclado.nextInt());

        System.out.print("Ingrese su fecha de nacimiento: ");
        persona.setFechaNacimiento(LocalDate.of(teclado.nextInt(),teclado.nextInt(),teclado.nextInt()));

        System.out.print("Ingrese su DNI: ");
        persona.setDNI(teclado.next());

        return persona;
    }

}

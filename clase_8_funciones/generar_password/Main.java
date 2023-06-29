package clase_8_funciones.generar_password;

public class Main {
    public static void main(String[] args) {
        System.out.println(generarPassword());
    }

    private static String generarPassword(){
        long numAleatorio = (int) (Math.random() * 1000000);
        //long numeroAleatorio = Math.round(aleatorio);
        return "Hxd" + numAleatorio;
    }
}

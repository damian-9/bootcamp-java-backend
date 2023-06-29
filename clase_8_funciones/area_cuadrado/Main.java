package clase_8_funciones.area_cuadrado;

public class Main {
    public static void main(String[] args) {
        float area = getAreaCuadrado(15);
        System.out.println("El area del cuadrado es: " + area);
    }

    private static float getAreaCuadrado(int lado){
        return lado * lado;
    }
}

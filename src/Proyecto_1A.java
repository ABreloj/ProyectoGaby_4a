public class Proyecto_1A {

    private static int Practica1A(int x, int z) {
        System.out.println("Igualar el valor de y y z");
        if (x != z) {
            x = z;
        }
        return x;
    }

    public static void main(String[] args) {
        int x, y, z;
        y = 1;
        z = 10;
        x = y;

        int resultado = Practica1A(x, z);

        System.out.println("El resultado final es: " + resultado);
    }
}
import java.util.Scanner;

public class Proyecto_1A {

    private static int Practica1A(int y, int z) {


        if (y == z) {
            return 0;
        } else {
            int x=y*y;
            return x+ Practica1A(y+1,z);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int y, z;

        System.out.println("Incrementar y elevar al cuadrado hasta que x sea igual a z");

        System.out.println("Introduce el valor de y");
        y=scanner.nextInt();

        System.out.println("Introduce el valor de z");
        z=scanner.nextInt();

        int resultado = Practica1A(y, z);

        System.out.println("El resultado final es: " + resultado);

    }


}

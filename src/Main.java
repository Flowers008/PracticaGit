//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base, exponente;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base y el exponente del número: ");

        base = sc.nextInt();
        exponente = sc.nextInt();
    }
    public static int cuadrado(int exponente, int base) {
        int contador;
        int resultado = 1;

        for (contador = 0; contador < exponente; contador++) {
            resultado = resultado * base;
        }

        return resultado;
    }
}
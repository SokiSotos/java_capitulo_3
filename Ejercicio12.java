import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota de tu examen:");
        double nota1 = sc.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        double nota2 = sc.nextDouble();
        double total = ((nota2 - (nota1 * 0.4)) / 0.6);
            System.out.println("Para tener un " + nota2 + " , necesitas sacar un " + total + " en el proximo examen");
    sc.close();
    }
}
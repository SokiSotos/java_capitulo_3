import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el salario");
	double base = sc.nextDouble();
    double total = base/1.21;
        System.out.printf("Mi base imponible es de: " + base + " Euros, por lo que el total de la factura es de: " + "%.2f Euros",total);
    sc.close();
    }
}
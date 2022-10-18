import java.util.Scanner;
public class Ejercicio8 {
    public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Introduce las horas trabajadas en una semana");
	double horas = sc.nextDouble();
    double sueldo = horas*5*12;
        System.out.printf("Tu sueldo en una semana es de %.2f",sueldo);
    sc.close();
    }
}

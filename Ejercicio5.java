import java.util.Scanner;
public class Ejercicio5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base del rectangulo");
		double base = sc.nextDouble();
		System.out.println("Introduce la altura del rectangulo");
		double altura = sc.nextDouble();
        double area = base*altura;
            System.out.printf("El area del rectangulo es: %.2f",area);
    sc.close();
	}
}
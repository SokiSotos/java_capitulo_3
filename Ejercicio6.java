import java.util.Scanner;
public class Ejercicio6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base del triangulo");
		double base = sc.nextDouble();
		System.out.println("Introduce la altura del triangulo");
		double altura = sc.nextDouble();
        double area = base*altura/2;
            System.out.printf("El area del triangulo es: %.2f",area);
    sc.close();
	}
}
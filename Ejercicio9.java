import java.util.Scanner;
public class Ejercicio9{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio del cono");
		double radio = sc.nextDouble();
		System.out.println("Introduce la altura del cono");
		double altura = sc.nextDouble();
        double volumen = Math.PI*Math.pow(radio, 2)*altura/3;
            System.out.printf("El volumen del cono es: %.2f cm cubicos",volumen);
    sc.close();
	}
}
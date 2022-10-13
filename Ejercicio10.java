import java.util.Scanner;
public class Ejercicio10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de MBs que quieres convertir a KBs");
		double mb = sc.nextDouble();
        double kb = mb*1024;
            System.out.printf(mb + " MBs son %.2f KBs",kb);
    sc.close();
	}
}
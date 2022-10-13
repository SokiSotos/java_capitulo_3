import java.util.Scanner;
public class Ejercicio11{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de KBs que quieres convertir a MBs");
		double kb = sc.nextDouble();
        double mb = kb/1024;
            System.out.printf(kb + " KBs son %.2f MBs",mb);
    sc.close();
	}
}
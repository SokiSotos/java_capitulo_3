import java.util.Scanner;
public class Ejercicio2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de euros que quiere convertir");
		int euros = sc.nextInt();
        double total = (double)euros*166.386;
    		System.out.printf(euros + " Euros son %.2f Pesetas",total);
    sc.close();
	}
}
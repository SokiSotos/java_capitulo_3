import java.util.Scanner;
public class Ejercicio2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de euros que quiere convertir");
		double euros = sc.nextDouble();
        double total = euros*166.386;
            System.out.printf(euros + " Euros son un total de %d Pesetas",(int)total);
    sc.close();
	}
}
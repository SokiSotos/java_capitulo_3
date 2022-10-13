import java.util.Scanner;
public class Ejercicio3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de pesetas que quiere convertir");
		int pesetas = sc.nextInt();
        double total = pesetas/166.386;
            System.out.printf(pesetas + " Pesetas son un total de %.2f Euros",total);
    sc.close();
	}
}
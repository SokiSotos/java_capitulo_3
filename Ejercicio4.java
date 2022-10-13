import java.util.Scanner;
public class Ejercicio4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int n2 = sc.nextInt();
            System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
            System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
            System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
            System.out.printf(n1 + " / " + n2 + " = %.2f",(double)n1/n2);
    sc.close();
	}
}
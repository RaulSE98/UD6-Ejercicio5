import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num = sc.nextInt();
		binario(num);

	}
	
	public static void binario (int num) {
		String binario = Integer.toBinaryString(num);
	    System.out.println(binario); 
	}

}

package tallerpoo;

import java.util.Scanner;

public class taller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero: ");
		
		Scanner sc = new Scanner(System.in);
	    
		int i = sc.nextInt(); 
	    
	    String numero =   Integer.toString(i);

	    boolean isnumber = true;

	    System.out.println("El primer caracter del numero ingresado es: " + numero.substring(0,1));
	}

}

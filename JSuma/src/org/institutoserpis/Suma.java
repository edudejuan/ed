package org.institutoserpis;

  import java.math.BigDecimal;
   import java.util.Scanner;
    public class Suma {
    	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 System.out.println("Programa suma");
	 System.out.print("Introduce el primer número");
	 String primerNumero = scanner.nextLine();
	 BigDecimal primero = new BigDecimal(primerNumero);
	  System.out.print("Introduce el segundo numero");
	  String segundoNumero = scanner.nextLine();
	  BigDecimal segundo = new BigDecimal(segundoNumero);
	  BigDecimal suma = BigDecimal.ZERO;
	  suma = suma.add(primero).add(segundo);
	  System.out.println("            La suma es: "  + suma);
	
	}
	
	

}

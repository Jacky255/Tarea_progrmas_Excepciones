package Ejercicios;

public class Excepciones12 {

	public static void main (String[]args){
	   int d = 0;
	   @SuppressWarnings("unused")
	int a = 42 / d;

      try { // Control bun bloke de codigo.
	      d = 0;
	      a = 42 / d;
	      System.out.println("Esto se imprimir�.");
	      
	    
      }
	    	  catch (ArithmeticException e) {// captura el error de divisi�n
	      System.out.println("Divisi�ncero.");
	    }
	    System.out.println("Despu�s de la sentencia catch.");
	  }
	}
	

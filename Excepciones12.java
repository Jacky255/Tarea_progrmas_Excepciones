package Ejercicios;

public class Excepciones12 {

	public static void main (String[]args){
	   int d = 0;
	   @SuppressWarnings("unused")
	int a = 42 / d;

      try { // Control bun bloke de codigo.
	      d = 0;
	      a = 42 / d;
	      System.out.println("Esto se imprimirá.");
	      
	    
      }
	    	  catch (ArithmeticException e) {// captura el error de división
	      System.out.println("Divisióncero.");
	    }
	    System.out.println("Después de la sentencia catch.");
	  }
	}
	

package Ejercicios;

public class Excepcion14 {

	  
	         @SuppressWarnings("unused")
			public static void main(String arg[])
	         {
		         int [] array = new int[20];
		         try
		         {
      //			array[-3] = 24;	
			   
		        	 int b = 0;
			         int a = 23/b;
		         }
		         catch(ArrayIndexOutOfBoundsException excepcion)
		         {
			         System.out.println(" Error de �ndice en un array");
		         }
		         catch(ArithmeticException excepcion)
		         {
			         System.out.println(" Error de �ndice en un array");
		         }

	         }
      }


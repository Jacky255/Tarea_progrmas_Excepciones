package Ejercicios;

	public class Excepciones9 {
		 public static void main(String arg[])
	     {
	         int [] array = new int[28];
	         try
	         {
		         array[-4] = 30;	
	         }
	         catch(ArrayIndexOutOfBoundsException excepcion)
	         {
		         System.out.println(" Error de �ndice en un array");
	         }
	     }

	}



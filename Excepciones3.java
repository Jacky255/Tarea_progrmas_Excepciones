package Ejercicios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Excepciones3 {

	
	    public static void main (String args[]){
	        try{
	            @SuppressWarnings("resource")
				RandomAccessFile raf = new RandomAccessFile("myfile.txt", "r");
	            byte b[] = new byte[1000];
	            raf.readFully(b, 0, 1000);
	             }
	        catch(FileNotFoundException e){
	            System.err.println("File not found");
	            System.err.println(e.getMessage());
	            e.printStackTrace();
	        }
	        catch(IOException e){
	            System.err.println("IO Error");
	            System.err.println(e.toString());
	            e.printStackTrace();
	            
	        System.out.print("Introduzca un numero");
	        @SuppressWarnings("unused")
			Object numero = b();
	       {
	        	
	        }
	        }
	    }

		private static Object b() {
			// TODO Auto-generated method stub
			return null;
		}
	}

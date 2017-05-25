package Ejercicios;

public class Excepciones13 {
	static void demoproc() throws IllegalAccessException {
		System.out.println("Dentro de demoproc");
		throw new IllegalAccessException("demo");
    	}
	
 public static void main (String args[]){
		try {	
			demoproc();
		} catch(IllegalAccessException e) {
			System.out.println("Capturada de nuevo:" + e);
					}
		}
		}



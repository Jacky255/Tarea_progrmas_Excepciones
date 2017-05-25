package Ejercicios;

public class Excepciones2 {

	class ServerTimeOutException extends Exception {

		private static final long serialVersionUID = 1L;}

	private static final Exception ServerTimeOutException = null;
	
	public void conectame( String nombreServidor ) throws Exception {
	
		int exito;
	
		int puerto = 80;
	exito = open( nombreServidor,puerto );
    
	if( exito == -1 )
	throw ServerTimeOutException;
	
	}

	private int open(String nombreServidor, int puerto) {
		// TODO Auto-generated method stub
		return 0;
	}
}

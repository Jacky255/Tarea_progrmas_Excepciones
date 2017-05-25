package Ejercicios;

@SuppressWarnings("unused")
public class Excepciones11 {

	class Limites extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;}
	@SuppressWarnings("serial")
	class demasiadoCalor extends Limites {}
	class demasiadoFrio extends Limites {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;}
	class demasiadoRapido extends Limites {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;}
	class demasiadoCansado extends Limites {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L; {
				
			    
	try {
	        int temp = 0;
			if( temp > 40 )
	            throw( new demasiadoCalor() );			
			int dormir = 0;
	        if( dormir < 8 )
	        	
	throw( new <Exception> Exception());
	    } catch( Limites lim ) {
	        if( lim instanceof demasiadoCalor ) {
	            System.out.println( "Capturada excesivo calor!" );
	            
	            }
	        if( lim instanceof demasiadoCansado ) {
	            System.out.println( "Capturada excesivo cansancio!" );
	            
	            }
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
	        System.out.println( "En la clausula finally" );
	     
	     
	     
	    
	}
		}
	}
}
	  
	     

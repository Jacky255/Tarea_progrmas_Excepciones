package Ejercicios;

	import java.util.InputMismatchException;
	import java.util.Scanner;

public class Excepciones6 {
		public void main(String[] args) {
		     @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		     int n1, n2;
		     try {
		            System.out.print("Introduce un n�mero: ");
		            n1 = sc.nextInt();
		            try {
		                    System.out.print("Introduce otro n�mero: ");
		                    n2 = sc.nextInt();
		                    System.out.println(n1 + " / " + n2 + " = " + n1/(double)n2);
		            }catch (InputMismatchException e) {
		                       sc.nextLine();
		                       n2 = 0;
		                       System.out.println("Debe introducir un n�mero");
		            }catch (ArithmeticException e) {
		                       sc.nextLine();
		                       n2 = 0;
		                       System.out.println("No se puede dividir por cero");
		            }
		     }catch (InputMismatchException e) {
		                sc.nextLine();
		                n1 = 0;
		                System.out.println("Debe introducir un n�mero");
		     }
		}

	}


import java.util.Scanner;

public class MySweetProgram {
	
	public static void main(String[] args) {
		System.out.println("Enter your name: ");

		Scanner in = new Scanner(System.in);
		//String s = in.nextLine();
		in.close();
		
		int i = 0; //inizializzazione
		
		do { //condizione
			System.out.println("i is: "+i);
			i++; //update
		} while (false);
		
		
	}	
}

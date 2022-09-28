import java.util.Scanner;
public class ProgrammingAssignment2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int par = scanner.nextInt();
		int stroke = scanner.nextInt();
		
		if(par==3 || par==4 || par==5) {
			if(stroke==par-2)
				System.out.println("Eagle");
			else if(stroke==par-1)
				System.out.println("Birdie");
			else if(stroke==par)
				System.out.println("Par");
			else if(stroke==par+1)
				System.out.println("Bogey");
		}
		else
			System.out.println("Error");
		

	}

}

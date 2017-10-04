package tutorials;
import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sideA, sideB, sideC;
		
		Scanner input = new Scanner(System.in);
		String chooseSideString = null;
		
		System.out.println("Trying to solve a right triangle Eh? \nPlease enter which side you are 
				solving for>>> \nA\nB\nC"); 
				chooseSideString = input.nextLine();
						
		if(chooseSideString.equalsIgnoreCase("A"));
			
			System.out.println("Please enter side B");
			
			System.out.println("Please enter side C");
			
			sideA = Math.sqrt(sideC - Math.sqrt(sideB));
			
			Syste.out.println("Side A is" + sideA);
		
	}

}

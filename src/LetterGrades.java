import java.util.Scanner;

/**
 * 
 */

/**
 * @author Kimberli
 *
 */
public class LetterGrades {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int num = 0;
		String grade = null;
		String choice = "y";
		
		//output and prompts
		System.out.println("Grade Converter!");
		System.out.println();
	
		Scanner k = new Scanner(System.in);
	
		Methods.getGrade(num, choice, grade);
		
	}//psvm

}//end class letter grades

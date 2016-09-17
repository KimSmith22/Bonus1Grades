import java.util.Scanner;

/**
 * @author Kimberli
 *
 */
public class Methods {


	public static void getGrade(int num, String choice, String grade ) {
		Scanner k = new Scanner(System.in);
		do {
		System.out.println("Enter a numeric grade:  ");
		 num = k.nextInt();
			if(num<=60){
				System.out.println("Letter Grade:  F ");
			}else if(num > 60 && num < 67){
				System.out.println("Letter Grade:  D");
			}else if(num > 66 && num < 80){
				System.out.println("Letter Grade:  C");
			}else if(num> 79 && num < 88 ){
				System.out.println("Letter Grade:  B");
			}else{
				System.out.println("Letter Grade:  A");
					}
			System.out.println("Continue? y/n");
			k.nextLine();
			choice = k.nextLine();
			}while(choice.equals("y"));
			}
	}

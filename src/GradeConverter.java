import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		//welcome
		System.out.println("Welcome to the Grade to Letter Converter\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            
            System.out.print("Enter numerical grade:   ");
            int grade = sc.nextInt();
            String letterGrade = "F";
            if(grade >= 88) 
            	letterGrade = "A";
            	else if (grade >= 80)
            		letterGrade ="B";
            	else if (grade >= 67)
            		letterGrade ="C";
            	else if (grade >= 60)
            		letterGrade ="D";
            
            //print grade letter	        	            
            System.out.println("Letter grade: "+letterGrade);
            
            //ask to continue
            System.out.println("\nContinue? (Y/N)");
            choice = sc.next();
            if(choice.equalsIgnoreCase("n"))
            		System.out.println("Goodbye!");
        }
        sc.close();
	}

}

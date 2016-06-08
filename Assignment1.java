import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        Integer age;
        System.out.print ("What is your age:");
        age = sc.nextInt ();   
         if  (age  >= 18) 
               System.out.println ("You are eligible to vote.");
         else
                System.out.println ("You are not eligible to vote.");  
         
	}

}

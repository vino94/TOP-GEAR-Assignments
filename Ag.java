import java.util.Scanner;


public class Ag {
	
    public static void main ( String[] args ) throws InvalidAgeException 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String b=sc.nextLine();
		System.out.println("Enter your Age");
		int a = sc.nextInt();
		try{
		if(a>=18 && a<60){
			System.out.println("your age is valid");
			}
		else{
			
				throw new InvalidAgeException("Your age is invalid");
			
			}
		
	}catch(InvalidAgeException e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	}
	}
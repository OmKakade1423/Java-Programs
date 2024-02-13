package gitHub;

import java.util.Scanner;

public class LiftProblem {

	public void selectFloor()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Options: (1)Select a floor, (2)Fire alarm, (3)Quit");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
		case '3':
			System.out.println("You can go");
			break;
			
		case '2':
			System.out.println("EMERGANCY! Empty the building ASAP");
			break;
			
		case '1':
			System.out.println("Select the floor");
			int newfloor = sc.nextInt();
			if(newfloor < 1 || newfloor > 10)
			{
				System.out.println("Invalid selection");
			}
			else
			{
				int	currentFloor= 0;
				for(int i=currentFloor; i <= newfloor; i++)
					{
						System.out.print("... "+i);
					}
				System.out.println("\nWelcome");
			}
			
			break;
			
			default :
				System.out.println("Invalid selection ");
			
		}
	}
	
	public static void main(String[] args) {
		LiftProblem l =new LiftProblem();
		while(true)
		{
			l.selectFloor();
		}
	}

}
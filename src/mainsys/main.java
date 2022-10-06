package mainsys;
import java.util.Random;

public class main {

	public static void main() {
		// TODO Auto-generated method stub
		/*String[] choices = {"Event1", "Event2", "Event3"}; array of events
		
		Randomizes due to import random
		 - Switch
		//int i =_random.nextInt(choices.length); Dummy code - randomzies the array and picks a certain index.
		
		*/
		
		
		for (int i= 0; i < 3; i++) {
			
			Random _random = new Random();
			int ChoiceTotal = 4;
			int outcome = _random.nextInt(ChoiceTotal);
					
				switch(outcome){
				
					case 0:
						System.out.println("Case 0 Works");
						break;
						
					case 1:
						System.out.println("Case 1 Works");
						break;
						
					case 2:
						System.out.println("Case 2 Works");
						break;
						
					case 3:
						System.out.println("Case 3 Works");
						break;
						
					default:
						System.out.println("Default.");
						break;
				
					}
		}
		
	}

}

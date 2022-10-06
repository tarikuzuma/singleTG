package mainsys;
import java.util.*;

public class Start {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, player." + "\n" + "I know that everything"
				+ "seems surprising");
		
		sleep(125, 25, 100);
		
		while (true){
			System.out.println("Initializing player." + "\n" + "Please Input Character Name:");
			
			String userName = scanner.nextLine();
			System.out.println("I see, your name is " + userName + "\n" +
					"Are you sure about your name?" + "\n" + ">Yes" + "\n" + ">No");
			
			String confirmation = scanner.nextLine();
				if (confirmation.equals("Yes")) {
					System.out.println("May it be that way.");
					main.main();
					break;
					//teleports you to another class where the game wil lstart
				} else if (confirmation.equals("No")){
					System.out.println("May it repeat.");
				} else {
					System.out.println("None of the choices.");
				}
				
		}
		
	}
	public static void sleep(int num, int add, int time) {
		try {
			for (int i=0; i<num;i += add) {
				Thread.sleep(time);
				System.out.println("Loading..." + i + "%");
			}
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}
}


import java.util.Scanner;

public class Main {
	public static void main() {
		int number = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for melee, 2 for signs, or 3 for mixed:\n");
		number = scan.nextInt();
		buildNumber(number);
		scan.close();
	}
	
	public static void buildNumber(int buildpath){
		switch (buildpath){
		case 1: 
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
	}

}

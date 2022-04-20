import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("Type a number between 1 and 12: ");
		Scanner scannerObject= new Scanner(System.in);
		int monthNumber= scannerObject.nextInt();

		if (monthNumber <1 || monthNumber >12) {
			System.out.println(monthNumber + " is an invalid month");
		} else {
			System.out.println("Month choosed is: " + monthNumber);System.out.print ("valid month");
		}
	}
}
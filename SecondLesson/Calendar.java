import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("Type a number between 1 and 12: ");
		Scanner scannerObject= new Scanner(System.in);
		int monthNumber= scannerObject.nextInt();

		if (monthNumber >=1 && monthNumber <=12) {
			String month= "";			
			if (monthNumber == 1) {
				month= "January";
			} else if (monthNumber == 2) {
				month= "February";
			} else if (monthNumber == 3) {
				month= "March";
			} else if (monthNumber == 4) {
				month= "April";
			} else if (monthNumber == 5) {
				month= "May";
			} else if (monthNumber == 6) {
				month= "June";
			} else if (monthNumber == 7) {
				month= "July";
			} else if (monthNumber == 8) {
				month= "August";
			} else if (monthNumber == 9) {
				month= "September";
			} else if (monthNumber == 10) {
				month= "October";
			} else if (monthNumber == 11) {
				month= "November";
			} else {
				month= "December";
			}
			System.out.println("choosed month is: "+ month);
		} else {
			System.out.println(monthNumber + " is an invalid month");
		}
	}
}
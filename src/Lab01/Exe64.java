package Lab01;
import java.util.Scanner;

public class Exe64 {
	static boolean isValidMonth(String month) {
		switch(month) {
			case "1":
			case "Jan":
			case "Jan.":
			case "January":
			case "3":
			case "Mar":
			case "Mar.":
			case "March":
			case "5":
			case "May":
			case "7":
			case "Jul":
			case "July":
			case "8":
			case "Aug":
			case "Aug.":
			case "August":
			case "10": 
			case "Oct": 
			case "Oct.": 
			case "October": 
			case "12":
			case "Dec": 
			case "Dec.":
			case "December": 
			case "2": 
			case "Feb":
			case "Feb.":
			case "February":
			case "4":
			case "Apr":
			case "Apr.":
			case "April":
			case "6":
			case "Jun":
			case "June":
			case "9":
			case "Sep":
			case "Sept.":
			case "September":
			case "11":
			case "Nov":
			case "Nov.":
			case "November": 
				return true;
		}
		return false;
	}
	
	static boolean isValidYear(int year) {
		return year > 0;
	}
	
	static int daysOfMonth(String month, int year) {
		boolean isLeaf = true;
		if ((year%100==0&&year%400!=0) || year%4 != 0) {
			isLeaf = false;
		}
		switch (month) {
			case "1":
			case "Jan":
			case "Jan.":
			case "January":
			case "3":
			case "Mar":
			case "Mar.":
			case "March":
			case "5":
			case "May":
			case "7":
			case "Jul":
			case "July":
			case "8":
			case "Aug":
			case "Aug.":
			case "August":
			case "10": 
			case "Oct": 
			case "Oct.": 
			case "October": 
			case "12":
			case "Dec": 
			case "Dec.":
			case "December":
				return 31;
			case "2": 
			case "Feb":
			case "Feb.":
			case "February":
				if (isLeaf) {
					return 29;
				} else {
					return 28;
				}
			case "4":
			case "Apr":
			case "Apr.":
			case "April":
			case "6":
			case "Jun":
			case "June":
			case "9":
			case "Sep":
			case "Sept.":
			case "September":
			case "11":
			case "Nov":
			case "Nov.":
			case "November":
				return 30;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month:");
		String month = sc.nextLine();
		while(!isValidMonth(month)) {
			System.out.println("Invalid month.\nEnter month again:");
			month = sc.nextLine();
		}
		System.out.println("Enter year:");
		int year = sc.nextInt();
		while(!isValidYear(year)) {
			System.out.println("Invalid year.\nEnter year again:");
			year = sc.nextInt();
		}
		System.out.println("The number of days: "+daysOfMonth(month, year));
		sc.close();
	}
}

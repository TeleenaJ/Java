package JavaPrograms;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=obj.nextInt();
		if (year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("The given year is a leap year.");
				}
				else
				{
					System.out.println("The given year is not a leap year.");
				}
			}else{
				
					System.out.println("The given year is a leap year.");
				}
			}else {
					System.out.println("The given year is not a leap year.");
				}
			}
		}
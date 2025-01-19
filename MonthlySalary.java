package JavaPrograms;
enum Months{January ,February, March, April, May, June, July, August, September, October, November, December;}
public class enumSalary {
	public static void main(String[] args) {
		double salary = 5000.0;
		for(Months m:Months.values()) {
			System.out.println(m+": $"+salary);
		}
	}
}

package empwage;

public class UC2 {
	public static void main(String[] args) {
		
		int fulltime =1;
		int emphrs = 8;
		int wageperhr = 20;
		int salary;
		
		double empcheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Random Check : " +empcheck);
		
		if (fulltime == empcheck)
			System.out.println("Employee Hours is : "+emphrs);
		else
			System.out.println("Employee Hours is : 0");
		
		salary = (emphrs * wageperhr);
		System.out.println("Salary is : " +salary);
	}
	
}


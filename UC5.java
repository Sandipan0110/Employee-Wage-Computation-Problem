package empwage;

public class UC5 {
	public static void main(String[] args) {

		int parttime = 1;
		int fulltime = 2;
		int emphrs = 8;
		int wageperhr = 20;
		int workingdays=20;
		int salary;
		
		for(int i=1;i<=workingdays;i++) {
			
			double randomcheck = Math.floor(Math.random() * 10) % 3;
			System.out.println("Random Check : " +randomcheck);
	
			if (fulltime == randomcheck)
			System.out.println("Employee Hours is : "+emphrs);
			else
				if (parttime == randomcheck)
					System.out.println("Employee Hours is : " +emphrs);
				else 
					System.out.println("Empoyee Hours is : 0 ");
		}
		
		salary = (emphrs * wageperhr);
		System.out.println("Salary is : " +salary);
		
	}

}

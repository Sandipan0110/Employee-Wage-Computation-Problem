package empwage;

public class UC6 {
	public static void main(String[] args) {
		
		int isPartTime=1;
		int isFullTime=2;
		int empRatePerHr=20;
		int WorkingDays=20;
		int maxHrsInMonth=100;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int emphrs=8;
		int totalMonthlySalary=0;
		int wageperhr=20;
		
		while(totalEmpHrs > maxHrsInMonth && totalWorkingDays > WorkingDays ) {
		
			double randomcheck = Math.floor(Math.random() * 10) % 3;
			System.out.println("Random Check : " +randomcheck);

			if (isFullTime == randomcheck)
				System.out.println("Employee Hours is : " +emphrs);
			else
				if (isPartTime == randomcheck)
					System.out.println("Employee Hours is : " +emphrs);
				else 
					System.out.println("Empoyee Hours is : 0 ");
		}
	
		totalEmpHrs = (emphrs * wageperhr);
		System.out.println("Salary is : " +totalEmpHrs);

		totalMonthlySalary=(totalEmpHrs * empRatePerHr);
		System.out.println("Salary is : " +totalMonthlySalary);
	
	}

}

package empwage;

public class UC4 {
	public static void main(String[] args) {
		
		int num=1;
		int emphrs = 8;
		int wageperhr = 20;
		int salary;
		
		switch(num) {
	
			case 1: System.out.println("Part Time");
			break;
			case 2: System.out.println("Full Time");
			break;
			default: System.out.println(" 0 ");
		}
		
		salary = (emphrs * wageperhr);
		System.out.println("Salary is : " +salary);
	}

}

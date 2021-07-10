import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double standardPrice = 1.20;
		double electricityBill = 0;
		
		System.out.println("Enter the electricity units");
		Scanner sc = new Scanner(System.in);
		int units= sc.nextInt();
		
		if (units<100) {
			electricityBill = units*standardPrice;
		}
		else if(units<300) {
			electricityBill = (100*standardPrice)+(2*(units-100));
		}
		else {
			electricityBill = (100*standardPrice)+(2*200)+(3*(units-300));
		}
		
		System.out.println("Your Electricity Bill is "+electricityBill+" Rs");
		
	}

}

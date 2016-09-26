package quiz2;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner datainput=new Scanner(System.in);
		
		System.out.print("Enter the initial tuition:");
		double initialtuition=datainput.nextDouble();
		
		System.out.print("Enter the increase rate :");
		double rate=datainput.nextDouble();
		
		datainput.close();
		 
		
	
		double totaltuition=initialtuition;
		for (int i=1;i<=3;i++){
			totaltuition=totaltuition+initialtuition*(Math.pow(1+rate,i));
		}
		
		System.out.printf("The total amount of tuition that students need to pay $%.2f \n", totaltuition);
		
		}
		
	}


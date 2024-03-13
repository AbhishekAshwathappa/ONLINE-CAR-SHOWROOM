package interview;

import java.util.Scanner;

public class MainClass extends CarModels{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("These are the brands we have");
		System.out.println("1.Mahindra");
		System.out.println("2.TATA");
		System.out.println("Enter the above option you waant");
		int option=sc.nextInt();
		if(option==1) {
			System.out.println("We have below mentioned models on Mahindra");
			System.out.println("a.XUV-300");
			System.out.println("b.XUV-500");
			System.out.println("c.XUV-700");
			System.out.println("Enter the above option");
			String opt=sc.next();
			switch(opt) {
			case "a":
				xuv300();
				System.out.println();
				break;
			case "b":
				xuv500();
				System.out.println();
				break;
			case "c":
				xuv700();
				System.out.println();
				break;
			default:
				System.out.println("You entered wrong option");	
				System.out.println();
			}
		}
		else if(option==2) {
			System.out.println("We have below mentioned models on Mahindra");
			System.out.println("a.Safari");
			System.out.println("b.Nexon");
			System.out.println("c.Nano");
			System.out.println("Enter the above option");
			String opt=sc.next();
			switch(opt) {
			case "a":
				safari();
				System.out.println();
				break;
			case "b":
				nexon();
				System.out.println();
				break;
			case "c":
				nano();
				System.out.println();
				break;
			default:
				System.out.println("You entered wrong option");	
				System.out.println();
			}
		}
		else {
			System.out.println("You entered wrong option");
			System.out.println();
		}
	  }
	}

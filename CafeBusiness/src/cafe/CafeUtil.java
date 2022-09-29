package cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

	
	public int getStreakGoal() {
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public double getOrderTotal(double[]prices) {
		double sum = 0;
		for(int i = 0; i < prices.length; i++) {
			sum += prices[i];
		}
		return sum;
		
	}
	
	public void displayMenu(ArrayList<String> menuItems) {
		for(int i = 0; i < menuItems.size(); i++) {
			System.out.format("%d %s\n ",i ,menuItems.get(i) );
			
		}
	}
	
	public void addCustomer(ArrayList<String> customers) {
		Scanner s = new Scanner(System.in);
		System.out.println("\"Please enter your name:\"");
		String userName = s.nextLine();
		System.out.format("Hello, %s!", userName);
		System.out.format("There are %d people in front of you", customers.size());
		customers.add(userName);
		System.out.println(customers);
	}
	

}

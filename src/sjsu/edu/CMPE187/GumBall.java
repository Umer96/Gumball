//Team 13: Colin Chow, Muhammad Umer Sheikh
//Writing Test Cases I: Gum Ball Vending Machine
//CMPE 187

package sjsu.edu.CMPE187;

import java.util.HashMap;
import java.util.Scanner;

public class GumBall {
	   public static void main (String[] args) {
		   Scanner s=new Scanner(System.in);
		   Scanner r=new Scanner(System.in);
		   HashMap<String, Integer> mp = new HashMap<>();
	       	mp.put("quarter",25);
	       	mp.put("dime",10);
	       	mp.put("nickel",5);

	  
	System.out.println("For RED Gumballs press 0");
	System.out.println("For YELLOW Gumballs press 1");
	  
	int choice=s.nextInt();

	System.out.println("Please select the type of coins: quarter, dime, nickel ");
	int TypeOfCoinInserted=0;
	String coin=r.nextLine();
	  
	do {
	int val=0;
	if(mp.containsKey(coin)) val=mp.get(coin);
	if(val==0) {
	System.out.print("\n*****Invalid Coin Inserted*****\n");
	}
	  
	TypeOfCoinInserted+=val;
	System.out.print("Value of the coin inserted: ");
	System.out.println(TypeOfCoinInserted);
	System.out.println("Press 0 to continue");
	  
	coin=r.nextLine();	  	  
	}
	
	while(!coin.equals("0"));
  
	if(choice==0) {
	int cnt=TypeOfCoinInserted/5;
	int change=0;
	System.out.print("Want "+cnt +" Red GumBalls (0/1) :");
	int flag=s.nextInt();
	if(flag==0) {
	System.out.print("No of Red GumBalls You Want :");
	int num=s.nextInt();
	System.out.println();
	change=TypeOfCoinInserted-num*5;
	cnt=num;
	}
	
	System.out.println();
	System.out.println("****************RECEIPT**************");
	System.out.println(cnt+ " Red GumBall");
	System.out.println(change/5+ " Nickel Coin Returned");
	System.out.println("*************************************");  
	}
	
	else {
	int cnt=TypeOfCoinInserted/10;
	int change=TypeOfCoinInserted%10;
	System.out.print("Want "+cnt +" Yellow GumBalls (0/1) :");
	int flag=s.nextInt();
	if(flag==0) {
	System.out.print("No of Yellow GumBalls You want :");
	int num=s.nextInt();
	System.out.println();
	change=TypeOfCoinInserted-num*10;
	cnt=num;
	}
	System.out.println();
	System.out.println("****************RECEIPT**************");
	System.out.println(cnt+ " Yellow GumBall");
	System.out.println(change/10+ " Nickel Coin Returned");
	System.out.println("*************************************");
	}
	  
	   }
}

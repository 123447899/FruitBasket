package FruitDecoratorMain;
import java.util.Scanner;

import basket.basket;
import decorator.Apple;
import decorator.Banana;
import decorator.FruitDecorator;
import decorator.Lemon;
import decorator.Orange;
import decorator.Peach;

public class FruitDecoratorMain {
	public static int choice;
	public static int qty;
	
	public static void main(String[] args) {
		
		basket b1=new basket();

		FruitDecorator f1=null;
		do{
			System.out.println("=========Menu for basket======\n");
			
			System.out.println("       1.Apple. \n");
			System.out.println("       2.Orange. \n");
			System.out.println("       3.Banana. \n");
			System.out.println("       4.Lemon. \n");
			System.out.println("       5.Peach. \n");
			System.out.println("       6.Exit. \n");
			
			Scanner dd=new Scanner(System.in);
			choice=dd.nextInt();
			
			if (choice!=6)
			{
				System.out.println("Enter Quantity");
				qty=dd.nextInt();
			}
			switch(choice)
			{
			case 1:
				
				if(f1==null)
				 f1=new Apple(b1,qty);
				else
					f1=new Apple(f1,qty);
			break;
			
			case 2:
				if(f1==null)
					 f1=new Orange(b1,qty);
					else
						f1=new Orange(f1,qty);
				break;
			case 3:
				if(f1==null)
					 f1=new Banana(b1,qty);
					else
						f1=new Banana(f1,qty);
				break;
				
			case 4:
				if(f1==null)
					 f1=new Lemon(b1,qty);
					else
						f1=new Lemon(f1,qty);
				break;
				
				
			case 5:
				if(f1==null)
					 f1=new Peach(b1,qty);
					else
						f1=new Peach(f1,qty);
				break;
				
			}
			
		}while(choice!=6);
		{
			System.out.println("Printing"+ f1.getName()+ "==>>"+" Quantity including Basket=" +"==>" +f1.getQuantity()+ ": price Including Basket= " +f1.getPrice());
		}
		
	}

}

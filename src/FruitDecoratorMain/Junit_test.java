package FruitDecoratorMain;
import static org.junit.Assert.*;

import org.junit.Test;

import basket.basket;
import decorator.Apple;
import decorator.Banana;
import decorator.FruitDecorator;
import decorator.Lemon;
import decorator.Orange;
import decorator.Peach;



public class Junit_test {
		@Test
		
		public void TestMethodBasket()
		{
			basket b1=new basket();
			assertEquals("with basket",5,b1.getPrice());
			
		}
		
		@Test
		
		public void TestmethodApplebasketname()
		{
			basket b1=new basket();
			Apple a1=new Apple(b1,10);
			assertEquals("with basket and apple","basket::apple",a1.getName());

	}
		
		public void TestmethodApplebasketorangeprice()
		{
			basket b1=new basket();
			Apple a1=new Apple(b1,10);
			Orange o1=new Orange(b1,3);
			assertEquals("with basket ,orange and  apple","basket::apple::orange",o1.getPrice());

		}
		
		public void TestmethodApplebasketorangeLemonprice()
		{
			basket b1=new basket();
			Apple a1=new Apple(b1,10);
			Orange o1=new Orange(b1,3);
			Lemon l1=new Lemon(o1,5);
			assertEquals("with basket ,orange and  apple","basket::apple::orange:lemon",o1.getPrice());

		}
		public void TestmethodApplebasketorangeLemonBananaprice()
		{
			basket b1=new basket();
			Apple a1=new Apple(b1,10);
			Orange o1=new Orange(b1,3);
			Lemon l1=new Lemon(o1,5);
			Banana ba1=new Banana(o1,6);
			assertEquals("with basket ,orange and  apple","basket::apple::orange:banana",ba1.getPrice());

		}
		
		public void TestmethodApplebasketappleorangeLemonPeachBananaprice()
		{
			basket b1=new basket();
			Apple a1=new Apple(b1,10);
			Orange o1=new Orange(b1,3);
			Lemon l1=new Lemon(o1,5);
			Banana ba1=new Banana(o1,6);
			assertEquals("with basket ,orange and  apple","basket::apple::orange:banana:lemon:peach",ba1.getPrice());

		}
		
		
		public void Testmethodcoverage(){
			
			basket b1=new basket();
			Apple a1=new Apple(b1,5);
			System.out.println("Printing"+ a1.getName()+" "+ a1.getQuantity() +" "+ a1.getPrice());
			
			Orange o1=new Orange(a1,20);
			System.out.println("Printing"+ o1.getName()+" "+ o1.getQuantity() + " " +o1.getPrice());
			
			Lemon l1=new Lemon(o1,30);
			System.out.println("Printing"+ l1.getName()+" "+ l1.getQuantity() + " " +l1.getPrice());
			
			Banana ba1=new Banana(l1,50) ;
			System.out.println("Printing"+ ba1.getName()+" "+ ba1.getQuantity() + " "+ ba1.getPrice());
			
			Peach p1=new Peach(ba1,60);
			System.out.println("Printing"+ p1.getName()+" "+p1.getQuantity()+ " " +p1.getPrice());
			
		}

}

package decorator;

import basket.Fruit;


public class Apple  extends FruitDecorator{
	public static final double baseApplePrice=10.00;
	
	public int quantity;
	public Apple(Fruit fruit,int quantity)
	
	{
		super(fruit);
		this.quantity=quantity;
	}
	
	public String getName()
	{
		return super.getName()+" ::Apple";
				
	}
	 public int getQuantity()
	 {
		 return super.getQuantity()+ quantity;
		 
	 }
	 
	 public double getPrice()
	 {
		 return super.getPrice()+(baseApplePrice *quantity);
		 
	 }

}

package decorator;

import basket.Fruit;


	public class Banana  extends FruitDecorator{
		public static final double baseBananaPrice=2.00;
		
		public int quantity;
		public Banana(Fruit fruit,int quantity)
		
		{
			super(fruit);
			this.quantity=quantity;
		}
		
		public String getName()
		{
			return super.getName()+" ::Banana";
					
		}
		 public int getQuantity()
		 {
			 return super.getQuantity()+ quantity;
			 
		 }
		 
		 public double getPrice()
		 {
			 return super.getPrice()+(baseBananaPrice *quantity);
			 
		 }

	}




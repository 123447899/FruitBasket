package decorator;



import basket.Fruit;


	public class Lemon  extends FruitDecorator{
		public static final double baseLemonPrice=5.00;
		
		public int quantity;
		public Lemon(Fruit fruit,int quantity)
		
		{
			super(fruit);
			this.quantity=quantity;
		}
		
		public String getName()
		{
			return super.getName()+" ::Orange";
					
		}
		 public int getQuantity()
		 {
			 return super.getQuantity()+ quantity;
			 
		 }
		 
		 public double getPrice()
		 {
			 return super.getPrice()+(baseLemonPrice *quantity);
			 
		 }

	}




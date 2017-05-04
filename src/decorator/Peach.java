package decorator;



import basket.Fruit;


	public class Peach  extends FruitDecorator{
		public static final double basePeachPrice=25.00;
		
		public int quantity;
		public Peach(Fruit fruit,int quantity)
		
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
			 return super.getPrice()+(basePeachPrice *quantity);
			 
		 }

	}




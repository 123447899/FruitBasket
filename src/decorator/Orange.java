package decorator;



import basket.Fruit;


	public class Orange  extends FruitDecorator{
		public static final double baseOrangePrice=3.00;
		
		public int quantity;
		public Orange(Fruit fruit,int quantity)
		
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
			 return super.getPrice()+(baseOrangePrice *quantity);
			 
		 }

	}




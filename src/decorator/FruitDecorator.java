package decorator;

import basket.Fruit;

public abstract class FruitDecorator implements Fruit {
	private Fruit fruit=null;
	
	public FruitDecorator(Fruit fruit)
	{
		super();
		this.fruit=fruit;
	}
	public String getName()
	{
		return fruit.getName();
	}
	public int getQuantity()
	{
		return fruit.getQuantity();
		
	}
	public double getPrice()
	{
		return fruit.getPrice();
	}

}

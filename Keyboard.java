class Keyboard 
{
	String brand;
	String color;
	int noOfKeys;
	String type;
	double cost;
	
	Keyboard()
	{
		System.out.println("No arguments passed");
	}
	Keyboard(String brand)
	{
		System.out.println("Argument passed String..."+brand);
		this.brand=brand;
		
	}
	Keyboard(String brand,String color)
	{
		System.out.println("Arguments passed two Strings..."+brand+","+color);
		this.brand=brand;
		this.color=color;
	}
	Keyboard(String color,int noOfKeys)
	{
		System.out.println("Arguments passed String,int...."+color+","+noOfKeys);
		this.color=color;
		this.noOfKeys=noOfKeys;
	}
	Keyboard(int noOfKeys,String type)
	{
		System.out.println("Arguments passed int,String....."+noOfKeys+","+type);
		this.noOfKeys=noOfKeys;
		this.type=type;
	}
	Keyboard(String type,double cost)
	{
		System.out.println("Arguments passed String,double..."+type+","+cost);
		this.type=type;
		this.cost=cost;
	}
}
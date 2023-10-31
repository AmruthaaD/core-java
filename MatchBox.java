class MatchBox
{
	String brand;
	int noOfStick;
	double length;
	double price;
	char size;
	double weight;
	String type;
	
	MatchBox()
	{
		System.out.println("No arguments passed");
	}
	MatchBox(String brand)
	{
		System.out.println("Argument passed String..."+brand);
		this.brand=brand;	
	}
	MatchBox(int noOfStick)
	{
		System.out.println("Argument passed int..."+noOfStick);
		this.noOfStick=noOfStick;
	}
	MatchBox(double length,double price)
	{
		System.out.println("Arguments passed two double...."+length+","+price);
		this.length=length;
		this.price=price;
	}
	MatchBox(double price)
	{
		System.out.println("Argument passed double....."+price);
		this.price=price;
	}
	MatchBox(char size)
	{
		System.out.println("Arguments passed char..." +size);
		this.size=size;
	}
	MatchBox(double weight,int noOfStick)
	{
		System.out.println("Arguments passed double,int...."+weight+","+noOfStick);
		this.weight=weight;
		this.noOfStick=noOfStick;
	}
	MatchBox(String type,String brand)
	{
		System.out.println("Arguments passed two String..."+type+","+brand);
		this.type=type;	
		this.brand=brand;
	}
}
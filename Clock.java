class Clock
{
	String shape;
	int noOfPins;
	String showsSeconds;
	int format;
	
	Clock()
	{
		this("Rectangle",2,"None",24);
	}
	Clock(String shape)
	{
		super();
		this.shape=shape;
		System.out.println("String is passed as constuctor parameter"+shape);
	}
	Clock(String shape,int noOfPins)
	{
		super();
		this.shape=shape;
		this.noOfPins=noOfPins;
		System.out.println("String,int is passed as constuctor parameter"+shape+","+noOfPins);
	}
	Clock(String shape,int noOfPins,String showsSeconds)
	{
		super();
		this.shape=shape;
		this.noOfPins=noOfPins;
		this.showsSeconds=showsSeconds;
		System.out.println("String,int ,String is passed as constuctor parameter"+shape+","+noOfPins+","+showsSeconds);
	}
	Clock(String shape,int noOfPins,String showsSeconds,int format)
	{
		super();
		this.shape=shape;
		this.noOfPins=noOfPins;
		this.showsSeconds=showsSeconds;
		this.format=format;
		System.out.println("String,int ,String,int is passed as constuctor parameter"+shape+","+noOfPins+","+showsSeconds+","+format);
	}
}
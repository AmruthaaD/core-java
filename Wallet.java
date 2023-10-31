class Wallet
{
	String brand;
	String material;
	double width;
	int noOfCompartments;
	
	Wallet()
	{
		this("BagIt","leather",100,6);
	}
	Wallet(String brand)
	{
		super();
		this.brand=brand;
		System.out.println("String is passed as constuctor parameter"+brand);
	}
	Wallet(String brand,String material)
	{
		super();
		this.brand=brand;
		this.material=material;
		System.out.println("String,String is passed as constuctor parameter"+brand+","+material);
	}
	Wallet(String brand,String material,double width)
	{
		super();
		this.brand=brand;
		this.material=material;
		this.width=width;
		System.out.println("String,String,double is passed as constuctor parameter"+brand+","+material+","+width);
	}
	Wallet(String brand,String material,double width,int noOfCompartments)
	{
		super();
		this.brand=brand;
		this.material=material;
		this.width=width;
		this.noOfCompartments=noOfCompartments;
		System.out.println("String,String,double ,int is passed as constuctor parameter"+brand+","+material+","+width+","+noOfCompartments);
	}
}
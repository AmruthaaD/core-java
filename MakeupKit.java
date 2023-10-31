class MakeupKit
{
	String name;
	double cost;
	double weight;
	int noOfItems;
	
	MakeupKit()
	{
		
		this("Fitme",700,300,10);
	}
	MakeupKit(String name)
	{
		super();
		this.name=name;
		System.out.println("String is passed as constuctor parameter"+name);
	}
	MakeupKit(String name,double cost)
	{
		super();
		this.name=name;
		this.cost=cost;
		System.out.println("String,double is passed as constuctor parameter"+name+","+cost);
	}
	MakeupKit(String name,double cost,double weight)
	{
		super();
		this.name=name;
		this.cost=cost;
		this.weight=weight;
		System.out.println("String,double,double is passed as constuctor parameter"+name+","+cost+","+weight);
	}
	MakeupKit(String name,double cost,double weight,int noOfItems)
	{
		super();
		this.name=name;
		this.cost=cost;
		this.weight=weight;
		this.noOfItems=noOfItems;
		System.out.println("String,double,double ,int is passed as constuctor parameter"+name+","+cost+","+weight+","+noOfItems);
	}
}
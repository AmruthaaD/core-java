class MakeupKitStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in RocketStarter");
		MakeupKit makeupKit=new MakeupKit();
		System.out.println("MakeupKit name :"+makeupKit.name);
		System.out.println("MakeupKit cost :"+makeupKit.cost);
		System.out.println("MakeupKit weight :"+makeupKit.weight);
		System.out.println("MakeupKit noOfItems :"+makeupKit.noOfItems);
		
		MakeupKit makeupKit1=new MakeupKit("Spinzz");
		System.out.println("MakeupKit1 name :"+makeupKit1.name);
		System.out.println("MakeupKit1 cost :"+makeupKit1.cost);
		System.out.println("MakeupKit1 weight :"+makeupKit1.weight);
		System.out.println("MakeupKit1 noOfItems :"+makeupKit1.noOfItems);
		
		MakeupKit makeupKit2=new MakeupKit("Himalaya",450.45);
		System.out.println("MakeupKit2 name :"+makeupKit2.name);
		System.out.println("MakeupKit2 cost :"+makeupKit2.cost);
		System.out.println("MakeupKit2 weight :"+makeupKit2.weight);
		System.out.println("MakeupKit2 noOfItems :"+makeupKit2.noOfItems);
		
		MakeupKit makeupKit3=new MakeupKit("Lakme",400.50,350);
		System.out.println("MakeupKit3 name :"+makeupKit3.name);
		System.out.println("MakeupKit3 cost :"+makeupKit3.cost);
		System.out.println("MakeupKit3 weight :"+makeupKit3.weight);
		System.out.println("MakeupKit3 noOfItems :"+makeupKit3.noOfItems);
		
		MakeupKit makeupKit4=new MakeupKit("eyeshadow palete",405,120.0,15);
		System.out.println("MakeupKit4 name :"+makeupKit4.name);
		System.out.println("MakeupKit4 cost :"+makeupKit4.cost);
		System.out.println("MakeupKit4 weight :"+makeupKit4.weight);
		System.out.println("MakeupKit4 noOfItems :"+makeupKit4.noOfItems);
		System.out.println("Ending main in RocketStarter");

	}
}
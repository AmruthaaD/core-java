class HelmetStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in HelmetStarter");
		Helmet helmet=new Helmet();
		System.out.println("Helmet material  is :" +helmet.material);
		System.out.println("Helmet type  is :" +helmet.type);
		System.out.println("Helmet color  is :" +helmet.color);
		System.out.println("Helmet cost  is :" +helmet.cost);
		System.out.println("Helmet brand  is :" +helmet.brand);
		
		Helmet helmet1=new Helmet("Fiberglass");
		System.out.println("Helmet1 material  is :" +helmet1.material);
		System.out.println("Helmet1 type  is :" +helmet1.type);
		System.out.println("Helmet1 color  is :" +helmet1.color);
		System.out.println("Helmet1 cost  is :" +helmet1.cost);
		System.out.println("Helmet1 brand  is :" +helmet1.brand);
		
		Helmet helmet2=new Helmet("Thermoplastic","Open-face");
		System.out.println("Helmet2 material  is :" +helmet2.material);
		System.out.println("Helmet2 type  is :" +helmet2.type);
		System.out.println("Helmet2 color  is :" +helmet2.color);
		System.out.println("Helmet2 cost  is :" +helmet2.cost);
		System.out.println("Helmet2 brand  is :" +helmet2.brand);
		
		Helmet helmet3=new Helmet("D3O","Dual-sport","Red");
		System.out.println("Helmet3 material  is :" +helmet3.material);
		System.out.println("Helmet3 type  is :" +helmet3.type);
		System.out.println("Helmet3 color  is :" +helmet3.color);
		System.out.println("Helmet3 cost  is :" +helmet3.cost);
		System.out.println("Helmet3 brand  is :" +helmet3.brand);
		
		Helmet helmet4=new Helmet("Kevlar","Half-shell","gray",2719);
		System.out.println("Helmet4 material  is :" +helmet4.material);
		System.out.println("Helmet4 type  is :" +helmet4.type);
		System.out.println("Helmet4 color  is :" +helmet4.color);
		System.out.println("Helmet4 cost  is :" +helmet4.cost);
		System.out.println("Helmet4 brand  is :" +helmet4.brand);
		
		Helmet helmet5=new Helmet("Carbon fibers","Full Face","Black",2700,"Steelbird");
		System.out.println("Helmet5 material  is :" +helmet.material);
		System.out.println("Helmet5 type  is :" +helmet.type);
		System.out.println("Helmet5 color  is :" +helmet.color);
		System.out.println("Helmet5 cost  is :" +helmet.cost);
		System.out.println("Helmet5 brand  is :" +helmet.brand);
		System.out.println("Ending main in HelmetStarter");
	}
}
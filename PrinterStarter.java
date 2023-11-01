class PrinterStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in PrinterStarter");
		Printer printer=new Printer();
		System.out.println("Printer name  is :" +printer.name);
		System.out.println("Printer type  is :" +printer.type);
		System.out.println("Printer noOfCopies  is :" +printer.noOfCopies);
		System.out.println("Printer sides  is :" +printer.sides);
		System.out.println("Printer modelNo  is :" +printer.modelNo);
		
		Printer printer1=new Printer("hp");
		System.out.println("Printer1 name  is :" +printer1.name);
		System.out.println("Printer1 type  is :" +printer1.type);
		System.out.println("Printer1 noOfCopies  is :" +printer1.noOfCopies);
		System.out.println("Printer1 sides  is :" +printer1.sides);
		System.out.println("Printer1 modelNo  is :" +printer1.modelNo);
		
		Printer printer2=new Printer("Canon","3D");
		System.out.println("Printer2 name  is :" +printer2.name);
		System.out.println("Printer2 type  is :" +printer2.type);
		System.out.println("Printer2 noOfCopies  is :" +printer2.noOfCopies);
		System.out.println("Printer2 sides  is :" +printer2.sides);
		System.out.println("Printer2 modelNo  is :" +printer2.modelNo);
		
		Printer printer3=new Printer("canon","3D",150);
		System.out.println("Printer3 name  is :" +printer3.name);
		System.out.println("Printer3 type  is :" +printer3.type);
		System.out.println("Printer3 noOfCopies  is :" +printer3.noOfCopies);
		System.out.println("Printer3 sides  is :" +printer3.sides);
		System.out.println("Printer3 modelNo  is :" +printer3.modelNo);
		
		Printer printer4=new Printer("Canon","3D",200,"Two");
		System.out.println("Printer4 name  is :" +printer4.name);
		System.out.println("Printer4 type  is :" +printer4.type);
		System.out.println("Printer4 noOfCopies  is :" +printer4.noOfCopies);
		System.out.println("Printer4 sides  is :" +printer4.sides);
		System.out.println("Printer4 modelNo  is :" +printer4.modelNo);
		
		Printer printer5=new Printer("Canon","Inkjet",160,"one","ld1256");
		System.out.println("Printer5 name  is :" +printer5.name);
		System.out.println("Printer5 type  is :" +printer5.type);
		System.out.println("Printer5 noOfCopies  is :" +printer5.noOfCopies);
		System.out.println("Printer5 sides  is :" +printer5.sides);
		System.out.println("Printer5 modelNo  is :" +printer5.modelNo);
		System.out.println("Starting main in PrinterStarter");
	}
}
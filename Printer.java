class Printer
{
	String name;
	String type;
	int noOfCopies;
	String sides;
	String modelNo;
	
	Printer()
  {
    this("Canon","Laser",100,"One","LMD134");
     System.out.println("Printer created");
     
  }
  
  Printer(String name)
  {
    this.name=name;
    System.out.println("String is passed as argument: " +name);
    
  }
  
  Printer(String name,String type)
  {
    this.name=name;
    this.type=type;
    System.out.println("String,String is passed as argument: " +name+","+type);
    
  }
  
   Printer(String name,String type,int noOfCopies)
  {
    this(name,type);
    this.noOfCopies=noOfCopies;
    System.out.println("String,String, int is passed as argument: " +name+","+type+","+noOfCopies);
    
  }
  
  Printer(String name,String type,int noOfCopies,String sides)
  {
    this(name,type,noOfCopies);
    this.sides=sides;
    System.out.println("String,String,int,String is passed as argument: " +name+","+type+","+noOfCopies+","+sides);
    
  }
    Printer(String name,String type,int noOfCopies,String sides,String modelNo)
  {
    this(name,type,noOfCopies,sides);
    this.modelNo=modelNo;
    System.out.println("String,String,int,String,String is passed as argument: " +name+","+type+","+noOfCopies+","+sides+","+modelNo);
    
  }
}
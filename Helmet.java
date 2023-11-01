class Helmet
{
	String material;
	String type;
	String color;
	double cost;
	String brand;
	
	Helmet()
  {
    this("Plastic","HDPE","Black",500,"LMD134");
     System.out.println("Printer created");
     
  }
  
  Helmet(String material)
  {
    this.material=material;
    System.out.println("String is passed as argument: " +material);
    
  }
  
  Helmet(String material,String type)
  {
    this.material=material;
    this.type=type;
    System.out.println("String,String is passed as argument: " +material+","+type);
    
  }
  
   Helmet(String material,String type,String color)
  {
    this(material,type);
    this.color=color;
    System.out.println("String,String,int is passed as argument: " +material+","+type+","+color);
    
  }
  
  Helmet(String material,String type,String color,double cost)
  {
    this(material,type,color);
    this.cost=cost;
    System.out.println("String,String,String,double is passed as argument: " +material+","+type+","+color+","+cost);
    
  }
    Helmet(String material,String type,String color,double cost,String brand)
  {
    this(material,type,color,cost);
    this.brand=brand;
    System.out.println("String,String,String,double,String is passed as argument: " +material+","+type+","+color+","+cost+","+brand);
    
  }
}
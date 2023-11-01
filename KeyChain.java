class KeyChain
{
	String material;
	String idealFor;
	double ratings;
	double weight;
	String theme;
	
	KeyChain()
	{
    this("Steel","Women",4.5,20,"flower");
     System.out.println("KeyChain invoked");
     
  }
  
  KeyChain(String material)
  {
    this.material=material;
    System.out.println("String is passed as argument: " +material);
    
  }
  
  KeyChain(String material,String idealFor)
  {
    this.material=material;
    this.idealFor=idealFor;
    System.out.println("String,String is passed as argument: " +material+","+idealFor);
    
  }
  
   KeyChain(String material,String idealFor,double ratings)
  {
    this(material,idealFor);
    this.ratings=ratings;
    System.out.println("String,String, double is passed as argument: " +material+","+idealFor+","+ratings);
    
  }
  
  KeyChain(String material,String idealFor,double ratings,double weight)
  {
    this(material,idealFor,ratings);
    this.weight=weight;
    System.out.println("String,String,double,double is passed as argument: " +material+","+idealFor+","+ratings+","+weight);
    
  }
    KeyChain(String material,String idealFor,double ratings,double weight,String theme)
  {
    this(material,idealFor,ratings,weight);
    this.theme=theme;
    System.out.println("String,String,double,double,String is passed as argument: " +material+","+idealFor+","+ratings+","+weight+","+theme);
    
  }

}
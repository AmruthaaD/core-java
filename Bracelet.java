class Bracelet {
  
  String name;
  String type;
  double cost;
  String material;
  String color;
  
  Bracelet()
  {
    this("antique","bangle",5000,"metal","green");
     System.out.println("Bracelet created");
     
  }
  
  Bracelet(String name)
  {
    
    this.name=name;
    System.out.println("the name is passed as argument: " +name);
    
  }
  
  Bracelet(String name,String type)
  {
    
    this(name);
    this.type=type;
    System.out.println("the name  and type is passed as argument: " +name+","+type);
    
  }
   
   Bracelet(String name,String type,double cost)
  {
    
    this(name,type);
    this.cost=cost;
    System.out.println("the name,type and cost is passed as argument: " +name+","+type+","+cost);
    
  }
   
  
  Bracelet(String name,String type,double cost,String material)
  {
    
    this(name,type,cost);
    this.material=material;
    System.out.println("the name,type,cost and material is passed as argument: " +name+","+type+","+cost+","+material);
    
  }
  
  Bracelet(String name,String type,double cost,String material,String color)
  {
    
    this(name,type,cost,material);
    this.color=color;
    System.out.println("the name,type,cost ,material and color is passed as argument: " +name+","+type+","+cost+","+material+","+color);
    
  }
  
}
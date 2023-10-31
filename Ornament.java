class Ornament {
  
  String name;
  String properties;
  double density;
  double cost;
  
 Ornament()
  {
    this("gold","ductile",19.282,50000);
     System.out.println("MakeupKit created");
     
  }
  
  Ornament(String name)
  {
    super();
    this.name=name;
    System.out.println("the name is passed as argument: " +name);
    
  }
  
  Ornament(String name,String properties)
  {
    super();
    this.name=name;
    this.properties=properties;
    System.out.println("the name and properties  is passed as argument: " +name+","+properties);
    
  }
  
   Ornament(String name,String properties,double density)
  {
    super();
    this.name=name;
    this.properties=properties;
    this.density=density;
    System.out.println("the name,properties and density  is passed as argument: " +name+","+properties+","+density);
    
  }
  
  Ornament(String name,String properties,double density,double cost)
  {
    super();
    this.name=name;
    this.properties=properties;
    this.density=density;
    this.cost=cost;
    System.out.println("the name,properties,density and cost  is passed as argument: " +name+","+properties+","+density+","+cost);
    
  }
}
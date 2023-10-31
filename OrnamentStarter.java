class OrnamentStarter {
  
  public static void main(String[] args)
  {
    
    System.out.println("starting main in OrnamentStarter");
    
    Ornament ornament=new Ornament();
    System.out.println("Ornament name  is :" +ornament.name);
    System.out.println("Ornament properties  is :" +ornament.properties);
    System.out.println("Ornament density  is :" +ornament.density);
    System.out.println("Ornament cost  is :" +ornament.cost);
    
    Ornament ornament1=new Ornament("gold");
    System.out.println("Ornament1 name  is :" +ornament1.name);
    System.out.println("Ornament1 properties  is :" +ornament1.properties);
    System.out.println("Ornament1 density  is :" +ornament1.density);
    System.out.println("Ornament1 cost  is :" +ornament1.cost);
    
    Ornament ornament2=new Ornament("gold","ductile");
    System.out.println("Ornament2 name  is :" +ornament2.name);
    System.out.println("Ornament2 properties  is :" +ornament2.properties);
    System.out.println("Ornament2 density  is :" +ornament2.density);
    System.out.println("Ornament2 cost  is :" +ornament2.cost);
    
    Ornament ornament3=new Ornament("gold","ductile",19.282);
    System.out.println("Ornament3 name  is :" +ornament3.name);
    System.out.println("Ornament3 properties  is :" +ornament3.properties);
    System.out.println("Ornament3 density  is :" +ornament3.density);
    System.out.println("Ornament3 cost  is :" +ornament3.cost);
    
    Ornament ornament4=new Ornament("gold","ductile",19.282,50000);
    System.out.println("Ornament4 name  is :" +ornament4.name);
    System.out.println("Ornament4 properties  is :" +ornament4.properties);
    System.out.println("Ornament4 density  is :" +ornament4.density);
    System.out.println("Ornament4 cost  is :" +ornament4.cost);
    
    System.out.println("ending main in MakeupKitStarter");
    
    
  }
  
}
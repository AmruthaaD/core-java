class BraceletStarter {
  
  public static void main(String[] args)
  {
    
    System.out.println("starting main in BraceletStarter");
    
    Bracelet bracelet=new Bracelet();
    System.out.println("Bracelet name  is :" +bracelet.name);
    System.out.println("Bracelet type  is :" +bracelet.type);
    System.out.println("Bracelet cost  is :" +bracelet.cost);
    System.out.println("Bracelet material  is :" +bracelet.material);
    System.out.println("Bracelet color  is :" +bracelet.color);
    
    Bracelet bracelet1=new Bracelet("antique");
    System.out.println("Bracelet1 name  is :" +bracelet1.name);
    System.out.println("Bracelet1 type  is :" +bracelet1.type);
    System.out.println("Bracelet1 cost  is :" +bracelet1.cost);
    System.out.println("Bracelet1 material  is :" +bracelet1.material);
    System.out.println("Bracelet1 color  is :" +bracelet1.color);
    
    Bracelet bracelet2=new Bracelet("antique","gold");
    System.out.println("Bracelet2 name  is :" +bracelet2.name);
    System.out.println("Bracelet2 type  is :" +bracelet2.type);
    System.out.println("Bracelet2 cost  is :" +bracelet2.cost);
    System.out.println("Bracelet2 material  is :" +bracelet2.material);
    System.out.println("Bracelet2 color  is :" +bracelet2.color);
    
    Bracelet bracelet3=new Bracelet("antique","gold",5000);
    System.out.println("Bracelet3 name  is :" +bracelet3.name);
    System.out.println("Bracelet3 type  is :" +bracelet3.type);
    System.out.println("Bracelet3 cost  is :" +bracelet3.cost);
    System.out.println("Bracelet3 material  is :" +bracelet3.material);
    System.out.println("Bracelet3 color  is :" +bracelet3.color);
    
    
    Bracelet bracelet4=new Bracelet("antique","gold",5000,"metal");
    System.out.println("Bracelet4 name  is :" +bracelet4.name);
    System.out.println("Bracelet4 type  is :" +bracelet4.type);
    System.out.println("Bracelet4 cost  is :" +bracelet4.cost);
    System.out.println("Bracelet4 material  is :" +bracelet4.material);
    System.out.println("Bracelet4 color  is :" +bracelet4.color);
    
    Bracelet bracelet5=new Bracelet("antique","gold",5000,"metal","yellow");
    System.out.println("Bracelet5 name  is :" +bracelet5.name);
    System.out.println("Bracelet5 type  is :" +bracelet5.type);
    System.out.println("Bracelet5 cost  is :" +bracelet5.cost);
    System.out.println("Bracelet5 material  is :" +bracelet5.material);
    System.out.println("Bracelet5 color  is :" +bracelet5.color);
    
    System.out.println("ending main in BraceletStarter");
    
    
  }
  
}
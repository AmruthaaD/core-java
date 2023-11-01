class CarromStarter {
  
  public static void main(String[] args)
  {
    
    System.out.println("starting main in CarromStarter");
    
    Carrom carrom=new Carrom();
    System.out.println("Carrom noofpawns  is :" +carrom.noofpawns);
    System.out.println("Carrom  boardtype is :" +carrom.boardtype);
    System.out.println("Carrom  players is :" +carrom.players);
    System.out.println("Carrom powdername  is :" +carrom.powdername);
    System.out.println("Carrom  color is :" +carrom.color);
    
    Carrom carrom1=new Carrom(19);
    System.out.println("Carrom1 noofpawns  is :" +carrom1.noofpawns);
    System.out.println("Carrom1  boardtype is :" +carrom1.boardtype);
    System.out.println("Carrom1  players is :" +carrom1.players);
    System.out.println("Carrom1 powdername  is :" +carrom1.powdername);
    System.out.println("Carrom1  color is :" +carrom1.color);
    
    Carrom carrom2=new Carrom(19,"square");
    System.out.println("Carrom2 noofpawns  is :" +carrom2.noofpawns);
    System.out.println("Carrom2  boardtype is :" +carrom2.boardtype);
    System.out.println("Carrom2  players is :" +carrom2.players);
    System.out.println("Carrom2 powdername  is :" +carrom2.powdername);
    System.out.println("Carrom2  color is :" +carrom2.color);
    
    Carrom carrom3=new Carrom(19,"square",4);
    System.out.println("Carrom3 noofpawns  is :" +carrom3.noofpawns);
    System.out.println("Carrom3  boardtype is :" +carrom3.boardtype);
    System.out.println("Carrom3  players is :" +carrom3.players);
    System.out.println("Carrom3 powdername  is :" +carrom3.powdername);
    System.out.println("Carrom3  color is :" +carrom3.color);
    
    Carrom carrom4=new Carrom(19,"square",4,"boricacid");
    System.out.println("Carrom4 noofpawns  is :" +carrom4.noofpawns);
    System.out.println("Carrom4  boardtype is :" +carrom4.boardtype);
    System.out.println("Carrom4  players is :" +carrom4.players);
    System.out.println("Carrom4 powdername  is :" +carrom4.powdername);
    System.out.println("Carrom4  color is :" +carrom4.color);
    
    Carrom carrom5=new Carrom(19,"square",4,"boricacid","black");
    System.out.println("Carrom5 noofpawns  is :" +carrom5.noofpawns);
    System.out.println("Carrom5  boardtype is :" +carrom5.boardtype);
    System.out.println("Carrom5  players is :" +carrom5.players);
    System.out.println("Carrom5 powdername  is :" +carrom5.powdername);
    System.out.println("Carrom5  color is :" +carrom5.color);
    
    System.out.println("ending main in CarromStarter");
    
    
  }
  
}
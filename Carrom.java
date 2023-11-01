class   Carrom {
  
  int noofpawns;
  String boardtype;
  int players;
  String powdername;
  String color;
  
  Carrom()
  {
    this(19,"square",4,"boricacid","black");
     System.out.println("Carrom created");
     
  }
  
  Carrom(int noofpawns)
  {
    
    this.noofpawns=noofpawns;
    System.out.println("the noofpawns is passed as argument: " +noofpawns);
    
  }
  
  Carrom(int noofpawns,String boardtype)
  {
    this(noofpawns);
    this.boardtype=boardtype;
    System.out.println("the noofpawns and boardtype is passed as argument: " +noofpawns+","+boardtype);
    
  }
   
   Carrom(int noofpawns,String boardtype,int players)
  {
    this(noofpawns,boardtype);
    this.players=players;
    System.out.println("the noofpawns,boardtype and players are passed as argument: " +noofpawns+","+boardtype+","+players);
    
  }
   
  
  Carrom(int noofpawns,String boardtype,int players,String powdername)
  {
    this(noofpawns,boardtype,players);
    this.powdername=powdername;
    System.out.println("the noofpawns,boardtype,players and powdername are passed as argument: " +noofpawns+","+boardtype+","+players+","+powdername);
    
  }
  
  Carrom(int noofpawns,String boardtype,int players,String powdername,String color)
  {
    this(noofpawns,boardtype,players,powdername);
    this.color=color;
    System.out.println("the noofpawns,boardtype,players,powdername and color are passed as argument: " +noofpawns+","+boardtype+","+players+","+powdername+","+color);
    
  }
  
}
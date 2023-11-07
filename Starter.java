class Starter{
	public static void main(String[] args)
	{
		System.out.println("Starting main in Starter");
		Color color=Color.RED;
		Tent tent=new Tent();
		Agent agent=new Agent();
		tent.showInfo(24,color,35,50);
		agent.openTent(tent);
		agent.close(tent);
		agent.showInfo();
		System.out.println("ending main in Starter");
		
	}
}
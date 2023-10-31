class ClockStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in ClockStarter");
		Clock clock=new Clock();
		System.out.println("Clock shape :"+clock.shape);
		System.out.println("Clock noOfPins :"+clock.noOfPins);
		System.out.println("Clock showsSeconds :"+clock.showsSeconds);
		System.out.println("Clock format :"+clock.format);
		
		Clock clock1=new Clock("circle");
		System.out.println("Clock1 shape :"+clock1.shape);
		System.out.println("Clock1 noOfPins :"+clock1.noOfPins);
		System.out.println("Clock1 showsSeconds :"+clock1.showsSeconds);
		System.out.println("Clock1 format :"+clock1.format);
		
		Clock clock2=new Clock("Oval",3);
		System.out.println("Clock2 shape :"+clock2.shape);
		System.out.println("Clock2 noOfPins :"+clock2.noOfPins);
		System.out.println("Clock2 showsSeconds :"+clock2.showsSeconds);
		System.out.println("Clock2 format :"+clock2.format);
		
		Clock clock3=new Clock("Square",3,"yes");
		System.out.println("Clock3 shape :"+clock3.shape);
		System.out.println("Clock3 noOfPins :"+clock3.noOfPins);
		System.out.println("Clock3 showsSeconds :"+clock3.showsSeconds);
		System.out.println("Clock3 format :"+clock3.format);
		
		Clock clock4=new Clock("Triangle",3,"none",12);
		System.out.println("Clock4 shape :"+clock4.shape);
		System.out.println("Clock4 noOfPins :"+clock4.noOfPins);
		System.out.println("Clock4 showsSeconds :"+clock4.showsSeconds);
		System.out.println("Clock4 format :"+clock4.format);
		System.out.println("Ending main in ClockStarter");

	}
}
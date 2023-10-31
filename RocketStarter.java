class RocketStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in RocketStarter");
		Rocket rocket=new Rocket();
		System.out.println("Rocket name :"+rocket.name);
		System.out.println("Rocket propellants :"+rocket.propellants);
		System.out.println("Rocket volume :"+rocket.volume);
		System.out.println("Rocket energy :"+rocket.energy);
		
		Rocket rocket1=new Rocket("Challenger");
		System.out.println("Rocket1 name :"+rocket1.name);
		System.out.println("Rocket1 propellants :"+rocket1.propellants);
		System.out.println("Rocket1 volume :"+rocket1.volume);
		System.out.println("Rocket1 energy :"+rocket1.energy);
		
		Rocket rocket2=new Rocket("PSLV","solid");
		System.out.println("Rocket2 name :"+rocket2.name);
		System.out.println("Rocket2 propellants :"+rocket2.propellants);
		System.out.println("Rocket2 volume :"+rocket2.volume);
		System.out.println("Rocket2 energy :"+rocket2.energy);
		
		Rocket rocket3=new Rocket("GSLV","liquid",2000);
		System.out.println("Rocket3 name :"+rocket3.name);
		System.out.println("Rocket3 propellants :"+rocket3.propellants);
		System.out.println("Rocket3 volume :"+rocket3.volume);
		System.out.println("Rocket3 energy :"+rocket3.energy);
		
		Rocket rocket4=new Rocket("LVM3","solid",1200,"Thermal");
		System.out.println("Rocket4 name :"+rocket4.name);
		System.out.println("Rocket4 propellants :"+rocket4.propellants);
		System.out.println("Rocket4 volume :"+rocket4.volume);
		System.out.println("Rocket4 energy :"+rocket4.energy);
		System.out.println("Ending main in RocketStarter");

	}
}
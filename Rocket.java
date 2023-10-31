class Rocket
{
	String name;
	String propellants;
	double volume;
	String energy;
	
	Rocket()
	{
		this("Trailblazer","liquid",3500,"Kinetic");
	}
	Rocket(String name)
	{
		super();
		this.name=name;
		System.out.println("String is passed as constuctor parameter"+name);
	}
	Rocket(String name,String propellants)
	{
		super();
		this.name=name;
		this.propellants=propellants;
		System.out.println("String,String is passed as constuctor parameter"+name+","+propellants);
	}
	Rocket(String name,String propellants,double volume)
	{
		super();
		this.name=name;
		this.propellants=propellants;
		this.volume=volume;
		System.out.println("String,String,double is passed as constuctor parameter"+name+","+propellants+","+volume);
	}
	Rocket(String name,String propellants,double volume,String energy)
	{
		super();
		this.name=name;
		this.propellants=propellants;
		this.volume=volume;
		this.energy=energy;
		System.out.println("String,String,double ,String is passed as constuctor parameter"+name+","+propellants+","+volume+","+energy);
	}
}
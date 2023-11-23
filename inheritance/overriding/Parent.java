class Parent
{
	String name
	int age;
	double height;
	double weight;
    String color;
	String land;
	int childrens;
	int vehicles;
	int houses;
	String friend;
	
	void setInstance(String name,int age,double height,double weight,String color,String land,int childrens,int vehicles,int houses,String friend){
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.color=color;
		this.land=land;
		this.childrens=childrens;
		this.vehicles=vehicles;
		this.houses=houses;
		this.friend=friend;
	
	}
	
    void healthy(){
		System.out.println("running healthy in Parent");
	}

    void active(){
		System.out.println("running active in Parent");
	}	
	void workoholic(){
		System.out.println("running workoholic in Parent");
	}
	void kind(){
		System.out.println("running kind in Parent");
	}
	void handlingPressure(){
		System.out.println("running handlingPressure in Parent");
	}
	void solvingProblems(){
		System.out.println("running solvingProblems in Parent");
	}
	void caringFamily(){
		System.out.println("running caringFamily in Parent");
	}
	void earning(){
		System.out.println("running earning in Parent");
	}
	void job(){
		System.out.println("running job in Parent");
	}
	void leader(){
		System.out.println("running leader in Parent");
	}
	void goodperson(){
		System.out.println("running goodperson in Parent");
	}
	void show(){
		System.out.println("starting show in Parent");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("height:"+height);
		System.out.println("weight:"+weight);
		System.out.println("color:"+color);
		System.out.println("properties:"+properties);
		System.out.println("childrens:"+childrens);
		System.out.println("vehicles:"+vehicles);
		System.out.println("houses:"+houses);
		System.out.println("friend:"+friend);
		System.out.println("ending show in Parent");
	}
}
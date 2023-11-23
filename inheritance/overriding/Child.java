class Child extends Parent{
	String name;
	String property;
	
	void property(){
		System.out.println("running property in Child");
	}
	void respectParents(){
		System.out.println("running respectParents in Child");
	}
	void familyResponsibility(){
		System.out.println("running familyResponsibility in Child");
	}
	void goodSibling(){
		System.out.println("running goodSibling in Child");
	}
	
	@Override
	void handlingPressure(){
		System.out.println("overriding inherited method handlingPressure()");
	}
	@Override
	void solvingProblems(){
		System.out.println("overriding inherited method solvingProblems()");
	}
	@Override
	void caringFamily(){
		System.out.println("overriding inherited method caringFamily()");
	}
	@Override
	void earning(){
		System.out.println("overriding inherited method earning()");
	}
	void show(){
		System.out.println("starting show in Child");
		System.out.println("name:"+this.name);
		System.out.println("property:"+this.property);
		System.out.println("ending show in Child");
	}
	
}

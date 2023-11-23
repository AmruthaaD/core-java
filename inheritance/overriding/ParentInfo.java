class ParentInfo{
	public static void main(String args[]){
		System.out.println("starting main in ParentInfo");
		Parent parent=new Parent();
		parent.setInstance("Seetha",50,167,70,"WHITE","2 sites",2,1,3,"Ram");
		parent.healthy();
		parent.active();
		parent.workoholic();
		parent.kind();
		parent.handlingPressure();
		parent.solvingProblems();
		parent.caringFamily();
		parent.earning();
		parent.job();
		parent.leader();
		parent.goodperson();
		parent.show();
		
		Child child=new Child();
		child.name="Sihi";
		child.property="2acre land";
		child.property();
		child.respectParents();
		child.familyResponsibility();
		child.goodSibling();
		child.handlingPressure();
		child.solvingProblems();
		child.caringFamily();
		child.earning();
		child.show();
		System.out.println("ending main in ParentInfo");
		
	}
}

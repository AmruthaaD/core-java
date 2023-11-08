class Email{
	String domain;
	int id;
	String firstName;
	String lastName;
	
	Email(String domain, int id, String firstName, String lastName){
		this.domain=domain;
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	
	void displayInfo(){
		System.out.println("Starting info in Email");
		System.out.println("Email domain:"+this.domain);
		System.out.println("Email id:"+this.id);
		System.out.println("Email fName:"+this.firstName);
		System.out.println("Email lastName:"+this.lastName);
		System.out.println("Ending info in Email");
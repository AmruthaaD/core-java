class PersonRunning{
	public static void main(String[] nnn){
		System.out.println("Starting main");
		Email[] email= new Email[4];
		
		email[0]=new Email("email.com",77,"Kavya","Bhat");
		email[1]=new Email("gmail.com",17,"Vidya","Shree");
		email[2]=new Email("yahoo.com",877,"Ram","Seetha");
		email[3]=new Email("facebook.com",421,"keerthi","Patel");
		
		Person person = new Person("Akhila",email);
		person.displayInfo();
		
		System.out.println("Ending main");
	}
}
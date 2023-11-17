class AddressStarter{
	public static void main(String[] args)
	{
		System.out.println("Starting main in AddressStarter");
		Address address=new Address();
		Address address1=new CityName();
		Address address2=new StreetName();
		Address address3=new DoorNo();
		
		CityName cityName=new CityName();
		CityName cityName1=new StreetName();
		CityName cityName2=new DoorNo();
		
		StreetName streetName=new StreetName();
		StreetName streetName1=new DoorNo();
		
		DoorNo doorNo=new DoorNo();
		System.out.println("Ending main in AddressStarter");
	}
}
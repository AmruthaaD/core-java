class ShowRoom
{
	String name;
	String ownerName;
	long contactNo;
	String openingTime;
	String location;
	int pincode;
	String nearLandmark;
	String type;
	
	ShowRoom()
	{
		System.out.println("No arguments passed");
	}
	ShowRoom(String name)
	{
		System.out.println("Argument passed String..."+name);
		this.name=name;
	
	}
	ShowRoom(String ownerName,long contactNo)
	{
		System.out.println("Arguments passed String,long..."+ownerName+","+contactNo);
	}
	ShowRoom(long contactNo)
	{
		System.out.println("Argument passed long..."+contactNo);
		this.contactNo=contactNo;
	}
	ShowRoom(String openingTime,String location)
	{
		System.out.println("Arguments passed two String..."+openingTime+","+location);
		this.openingTime=openingTime;
		this.location=location;
	}
	ShowRoom(int pincode)
	{
		System.out.println("Argument passed int..."+pincode);
		this.pincode=pincode;
	}
	 ShowRoom(int pincode,String nearLandmark)
	 {
		 System.out.println("Arguments passed int, String..."+pincode+","+nearLandmark);
		 this.pincode=pincode;
		 this.nearLandmark=nearLandmark;
	 }
	 ShowRoom(String name,String openingTime,String type)
	 {
		 System.out.println("Arguments passed three Strings..."+name+","+openingTime+","+type);
		 this.name=name;
		 this.openingTime=openingTime;
		 this.type=type;
	 }
}
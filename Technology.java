class Technology{
	
	String name;
	String relatedIndustry;
	int noOflearners;
	String type;
	String technologyUsedInGoogle;
	String technologyUsedInYouTube;
	String technologyUsedInFaceBook;
	String technologyUsedInInstagram;
	String technologyUsedInWhatsApp;
	String technologyUsedInSnapChat;
	String technologyUsedInLinkdin;
	String technologyUsedInFlipkart;
	
	
	Technology(String name,String relatedIndustry,int noOflearners,String type,String technologyUsedInGoogle,String technologyUsedInYouTube,String technologyUsedInFaceBook,String technologyUsedInInstagram,String technologyUsedInWhatsApp,String technologyUsedInSnapChat,String technologyUsedInLinkdin,String technologyUsedInFlipkart){
		
		this.name=name;
		this.relatedIndustry=relatedIndustry;
		this.noOflearners=noOflearners;
		this.type=type;
		this.technologyUsedInGoogle=technologyUsedInGoogle;
		this.technologyUsedInYouTube=technologyUsedInYouTube;
		this.technologyUsedInFaceBook=technologyUsedInFaceBook;
		this.technologyUsedInInstagram=technologyUsedInInstagram;
		this.technologyUsedInWhatsApp=technologyUsedInWhatsApp;
		this.technologyUsedInSnapChat=technologyUsedInSnapChat;
		this.technologyUsedInLinkdin=technologyUsedInLinkdin;
		this.technologyUsedInFlipkart=technologyUsedInFlipkart;
		
		System.out.println("Constructor invoked");
	}
	
	void displayInfo(){
		
		System.out.println(this.name);
		System.out.println(this.relatedIndustry);
		System.out.println(this.noOflearners);
		System.out.println(this.type);
		System.out.println(this.technologyUsedInGoogle);
		System.out.println(this.technologyUsedInYouTube);
		System.out.println(this.technologyUsedInFaceBook);
		System.out.println(this.technologyUsedInInstagram);
		System.out.println(this.technologyUsedInWhatsApp);
		System.out.println(this.technologyUsedInSnapChat);
		System.out.println(this.technologyUsedInLinkdin);
		System.out.println(this.technologyUsedInFlipkart);
	}
}
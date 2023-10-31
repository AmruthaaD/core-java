class WalletStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in WalletStarter");
		Wallet wallet=new Wallet();
		System.out.println("Wallet brand :"+wallet.brand);
		System.out.println("Wallet material :"+wallet.material);
		System.out.println("Wallet width :"+wallet.width);
		System.out.println("Wallet noOfCompartments :"+wallet.noOfCompartments);
		
		Wallet wallet1=new Wallet("SunShopping");
		System.out.println("Wallet1 brand :"+wallet1.brand);
		System.out.println("Wallet1 material :"+wallet1.material);
		System.out.println("Wallet1 width :"+wallet1.width);
		System.out.println("Wallet1 noOfCompartments :"+wallet1.noOfCompartments);
		
		Wallet wallet2=new Wallet("gullak","plastic");
		System.out.println("Wallet2 brand :"+wallet2.brand);
		System.out.println("Wallet2 material :"+wallet2.material);
		System.out.println("Wallet2 width :"+wallet2.width);
		System.out.println("Walle2t noOfCompartments :"+wallet2.noOfCompartments);
		
		Wallet wallet3=new Wallet("Wildhorn","Rubber",150);
		System.out.println("Wallet3 brand :"+wallet3.brand);
		System.out.println("Wallet3 material :"+wallet3.material);
		System.out.println("Wallet3 width :"+wallet3.width);
		System.out.println("Wallet3 noOfCompartments :"+wallet3.noOfCompartments);
		
		Wallet wallet4=new Wallet("Poilice","Jute",130.0,8);
		System.out.println("Wallet4 brand :"+wallet4.brand);
		System.out.println("Wallet4 material :"+wallet4.material);
		System.out.println("Wallet4 width :"+wallet4.width);
		System.out.println("Wallet4 noOfCompartments :"+wallet4.noOfCompartments);
		System.out.println("Ending main in WalletStarter");

	}
}
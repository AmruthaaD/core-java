class KeyboardStarter
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in KeyboardStarter");
		Keyboard keyboard=new Keyboard();
		System.out.println("Keyboard brand :"+keyboard.brand);
		System.out.println("Keyboard color :"+keyboard.color);
		System.out.println("Keyboard noOfKeys :"+keyboard.noOfKeys);
		System.out.println("Keyboard type :"+keyboard.type);
		System.out.println("Keyboard cost :"+keyboard.cost);
		Keyboard keyboard1=new Keyboard("Korg");
		System.out.println("Keyboard1 brand :"+keyboard1.brand);
		System.out.println("Keyboard1 color :"+keyboard1.color);
		System.out.println("Keyboard1 noOfKeys :"+keyboard1.noOfKeys);
		System.out.println("Keyboard1 type :"+keyboard1.type);
		System.out.println("Keyboard1 cost :"+keyboard1.cost);
		Keyboard keyboard2=new Keyboard("Yamaha","black");
		System.out.println("Keyboard2 brand :"+keyboard2.brand);
		System.out.println("Keyboard2 color :"+keyboard2.color);
		System.out.println("Keyboard2 noOfKeys :"+keyboard2.noOfKeys);
		System.out.println("Keyboard2 type :"+keyboard2.type);
		System.out.println("Keyboard2 cost :"+keyboard2.cost);
		Keyboard keyboard3=new Keyboard("white",101);
		System.out.println("Keyboard3 brand :"+keyboard3.brand);
		System.out.println("Keyboard3 color :"+keyboard3.color);
		System.out.println("Keyboard3 noOfKeys :"+keyboard3.noOfKeys);
		System.out.println("Keyboard3 type :"+keyboard3.type);
		System.out.println("Keyboard3 cost :"+keyboard3.cost);
		Keyboard keyboard4=new Keyboard(104,"Wireless");
		System.out.println("Keyboard4 brand :"+keyboard4.brand);
		System.out.println("Keyboard4 color :"+keyboard4.color);
		System.out.println("Keyboard4 noOfKeys :"+keyboard4.noOfKeys);
		System.out.println("Keyboard4 type :"+keyboard4.type);
		System.out.println("Keyboard4 cost :"+keyboard4.cost);
		Keyboard keyboard5=new Keyboard("Wired",500);
		System.out.println("Keyboard5 brand :"+keyboard5.brand);
		System.out.println("Keyboard5 color :"+keyboard5.color);
		System.out.println("Keyboard5 noOfKeys :"+keyboard5.noOfKeys);
		System.out.println("Keyboard5 type :"+keyboard5.type);
		System.out.println("Keyboard5 cost :"+keyboard5.cost);
		System.out.println("Ending main in KeyboardStarter");

	}
}
class PlantRunning
{
	public static void main(String[] nnn){
		Plant plant = new Food2();
		plant.Growth();
		
		Food2 food = (Food2)plant;
		food.Growth();
		food.Preparing();
	}
	
}
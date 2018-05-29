
public class VirtualPet {
	int hunger = 5;
	int thirst = 5;
	int sleepy = 5;
	int unhappy = 5;

	public void catStatus() {
		System.out.println("\nYour cat's STATUS:\n Hungry = " + hunger + "/10\n Thirsty = " + thirst + "/10\n Sleepy = " + sleepy
				+ "/10\n Unhappy = " + unhappy
				+ "/10\n\nWhat would you like to do now? (Type \"help\" to see your options)");
	}

	
	public void feed() {
		hunger = 0;
		sleepy++;
	}

	public void giveWater() {
		thirst = 0;
		unhappy++;
	}

	public void putToBed() {
		sleepy = 0;
		thirst++;
	}

	public void play() {
		unhappy = 0;
		hunger++;
	}

	public void tick() {
		hunger += 1;
		thirst += 1;
		sleepy += 1;
		unhappy += 1;
	}

}

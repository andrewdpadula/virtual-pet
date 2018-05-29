import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		VirtualPet myCat = new VirtualPet();
		Scanner input = new Scanner(System.in);
		System.out.println("" + "    (\"`-''-/\").___..--''\"`-._\r\n" + "     `O_ O  )   `-.  (     ).`-.__.`)\r\n"
				+ "     (_Y_.)'  ._   )  `._ `. ``-..-'\r\n" + "   _..`--'_..-_/  /--'_.' ,'\r\n"
				+ "  (..).-''  (..).'  ((!.-'"

				+ "\n\nVIRTUAL PET!!!\n\nCongratulations! You have adopted a cat! \nYou bring your feline friend home"
				+ " from the pet shelter.\nThe cat tentatively explores"
				+ " its new home. \n\nWhat will you name your cat?");
		String catName = input.nextLine();
		if (catName.equalsIgnoreCase("Quit")) {
			System.out.println("           |\\.\"./|\r\n" + "          /       \\\r\n"
					+ "         /  _   _  \\   ______\r\n" + "         \\==  Y  ==/\"'`      `.\r\n"
					+ "         /`-._^_.-'\\     ,-  . \\\r\n" + "        /     `     \\   /     \\ \\\r\n"
					+ "        \\  \\.___./  /_ _\\     / /\r\n" + "         `, \\   / ,'  (,-----' /\r\n"
					+ "           \"\"' '\"\"     '------'" + "\nThanks for playing.\nGame over!");
			System.exit(0);
		}
		System.out.println("Ah, " + catName + ". A noble name for a noble beast. \n\nAs " + catName
				+ " zips across your living room and begins \nscratching the expensive leather sofa, you can"
				+ " feel a \nbeautiful relationship blossoming between the two of you. \n" + catName
				+ " purrs vigorously. Good kitty.");

		// This is where the game loop begins:

		while (myCat.hunger < 10 && myCat.thirst < 10 && myCat.sleepy < 10 && myCat.unhappy < 10) {
			myCat.catStatus();

			String command = input.nextLine();

			if (command.equalsIgnoreCase("Feed")) {
				myCat.feed();
				myCat.tick();
				System.out.println("You give " + catName
						+ " a snack. Your cat is no longer Hungry, but having a full belly makes it extra Sleepy.");
			} else if (command.equalsIgnoreCase("Give water")) {
				myCat.giveWater();
				myCat.tick();
				System.out.println("You give " + catName
						+ " some water. Your cat is no longer Thirsty but is feeling extra Unhappy because cats hate water.");
			} else if (command.equalsIgnoreCase("Put to bed")) {
				myCat.putToBed();
				myCat.tick();
				System.out.println("You send " + catName
						+ " to bed for a cat nap. Your cat is now well rested but getting pretty Thirsty.");
			} else if (command.equalsIgnoreCase("Play")) {
				myCat.play();
				myCat.tick();
				System.out.println("You play with " + catName
						+ ". Your cat is much happier now, but playtime is causing " + catName + " to get Hungry.");
			} else if (command.equalsIgnoreCase("Quit")) {
				System.out.println("           |\\.\"./|\r\n" + "          /       \\\r\n"
						+ "         /  _   _  \\   ______\r\n" + "         \\==  Y  ==/\"'`      `.\r\n"
						+ "         /`-._^_.-'\\     ,-  . \\\r\n" + "        /     `     \\   /     \\ \\\r\n"
						+ "        \\  \\.___./  /_ _\\     / /\r\n" + "         `, \\   / ,'  (,-----' /\r\n"
						+ "           \"\"' '\"\"     '------'" + "\nThanks for playing.\nGame over!");
				System.exit(0);
			} else if (command.equalsIgnoreCase("Help")) {
				System.out.println(
						"Choose one of the following options: Feed, Give water, Put to bed, Play. \nWith each action, the passing of time will make your cat a little more Hungry, Thirsty, Sleepy, and Unhappy.\nDon't let your cat get too Hungry, Thirsty, Sleepy, or Unhappy, or else it's game over!\nType \"Quit\" to exit at any time.");
			} else {
				System.out
						.println("Sorry, your command was not recognized. Try again.\nType \"Help\" if you are stuck!");

			}

			if (myCat.hunger >= 10) {
				System.out.println("\nOh no! You let your cat's Hunger level reach 10!\n" + catName
						+ " is on the brink of death from starvation when you slip on a banana peel and break your neck.\nYou die instantly. Hungry "
						+ catName + " devours your corpse, purring with satisfaction.\nGame over!");
			}
			if (myCat.thirst >= 10) {
				System.out.println("\nOh no! You let your cat's Thirst level reach 10!\n" + catName
						+ " is on the brink of dying from dehydration.\nSuddenly, " + catName
						+ " transforms into a large adult human and strangles you to death.\nHuman "
						+ catName
						+ " laughs and walks to the kitchen for a glass of water.\nNow fully hydrated and still in human form, "
						+ catName
						+ " decides to assume your\nidentity and does a better job living your life than you ever did.\nIn just a few years, "
						+ catName + " develops a cure for cancer and wins the Nobel Prize.\nThis is the \"good ending\" of this game.\nGame over!");
			}
			if (myCat.sleepy >= 10) {
				System.out.println("\nOh no! You let your cat's Sleepiness level reach 10!\n" + catName
						+ " is suffering from severe exhaustion.\nSuddenly, the police kick down your door.\nYou are arrested, convicted of cruelty to animals, and imprisoned for life.\nOne of the cops takes your miserable cat and gives it to his daughter, Cindy.\nCindy takes much better care of the cat than you did.\nGame over!");
			}
			if (myCat.unhappy >= 10) {
				System.out
						.println("\nOh no! You let your cat's Unhappiness level reach 10!\nIn a fit of rage, " + catName
								+ " slashes your jugular vein with razor-sharp claws.\nYou die in a matter of seconds. "
								+ catName + " feasts on your corpse and finally seems happy.\nGame over!");
			}

		}
	}
}

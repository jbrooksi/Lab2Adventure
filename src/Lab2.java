import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		
		String gettingFood, cookMeal, animal, sailWay, fooodBaby;
		
		//Welcome message to the game
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to this Fun ass Game!!");
		System.out.println("");
		
		//Gettin users name from input
		System.out.print("What is your name: ");
		String name = scan.nextLine();
		System.out.println("Welcome" + " " + name);
		
		//Would you like to play the game yes or no
		System.out.print("Would you like to play this fun ass game:  ");
		String playerChoice = scan.nextLine();
			if(playerChoice.equalsIgnoreCase("yes")){
				System.out.println("Great its time to play this fun ass Game: ");
			}else if(playerChoice.equalsIgnoreCase("no")){
				System.out.println("You are a Big Ole Fat Loser");
				scan.close();
				return;
	
			}
		
		//The beginging of the Story
			System.out.println("Your stranded in the jungle and your running out of food, what will you do next" + " " + "Do you go (Fishing or Hunting)");
			gettingFood = scan.nextLine();
			
		//First set of If statements, is user gonna fish or hunting.  
		//User must choose fishing to move on
			if (gettingFood.equalsIgnoreCase("fishing")){
				System.out.println("You caught a 7 pound fish and caught enough food for days");
				System.out.print(">  ");
				}else if(gettingFood.equalsIgnoreCase("hunting")){
					System.out.println("You had your face ripped off by a bear---You Loose");
					System.out.print(">  ");
					scan.close();
					return;
				}
		System.out.println("You have to decide how to eat your fish" + "   " + "(Cooked or Raw)" );
		cookMeal = scan.nextLine();
		
			if(cookMeal.equalsIgnoreCase("Cooked")){
				System.out.println("You cook a yummy meal and had food for days after");
				System.out.print("> ");
			}else if(cookMeal.equalsIgnoreCase("raw")){
				System.out.println("You die from infection HAHAHAHA--- Fool");
				System.out.print("> ");
				scan.close();
				return;    }
			
		System.out.println("You are approached by a ANGRY wolf what do you do----(fight, play dead or run)");
		animal = scan.nextLine();
		
		
			if(animal.equalsIgnoreCase("play dead")){
				System.out.println("You played dead and the wolf left you alone");
				System.out.print("> ");
			}else if(animal.equalsIgnoreCase("run")){
				System.out.println("You ran and the wolf caught you so ur dead hahaha");
				System.out.print("> ");
				scan.close();
				return;
			}else if(animal.equalsIgnoreCase("fight")){
				System.out.println("You are foolish to fight a wolf----your dead");
				System.out.print("> ");
				scan.close();
				return;
			} 
		System.out.println("Now you make you way to the shore and have to decide to (A = Build a Boat; B = Write SOS in the sand; C = Stay on the Island)");
		sailWay = scan.nextLine();
		System.out.print("> ");
		
		
			if(sailWay.equalsIgnoreCase("B")){
				System.out.println("You use a Stick to write SOS in the sand, and a Helicopter sees it and comes to rescue you");
				System.out.print("> ");
			}else if(sailWay.equalsIgnoreCase("A")){
				System.out.println("You build a boat and set sail, after 4 hours the boat sinks and YOU DIE");
				scan.close();
				return;
			}else if(sailWay.equalsIgnoreCase("C")){
				System.out.println("You stay on the island live a happy life and die and old man or women");
				scan.close();
				return;
			}
			
			System.out.println("You are now on the helicopter and offically saved");
			System.out.print("> ");
			System.out.println("What is the first thing you eat--(Popeyes--Buddys--BDubs)");
			
			fooodBaby = scan.nextLine();
			
			if(fooodBaby.equalsIgnoreCase("Popeyes")){
				System.out.println("Good choice, you walk into Popeyes and order a number 4, "
						+ "you sit down to enjoy your delicious golden tenders when you meet some girl name Bernadette(or a fellow name Jim)"
						+ "who goes on to be your lovely spose");
				scan.close();
				return;
			}	else if (fooodBaby.equalsIgnoreCase("Buddys")){
				System.out.println("You walk into buddys pizza, the best pizza ever and order a large peperoni, onion, bacon, "
						+ "and green pepper pizza.  You take a seat and wait for your pizza to come and enjoy a ice cold Angry Orchid. "
						+ " Your pizza arrives and it looks delicious, you take your first bite and choke on a piece of cheese and DIE");
				scan.close();
				return;
			}else if(fooodBaby.equalsIgnoreCase("Bdubs")){
				System.out.println("Ahhhh very nice, you walk into bdubs and on the way in you find a briefcase with millions of dollars in it. "
						+ " You buy a fast car crash and DIE");
				scan.close();
				return;
			}
			
			
		
		
		
			
			
			
			
		
		
	}

}

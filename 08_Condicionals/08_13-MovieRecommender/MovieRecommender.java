import java.util.Scanner;

public class MovieRecommender {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Movie Recommender!");
		System.out.println("Do you like action movies? (yes/no):");
		String resposta = scanner.nextLine();
		if (resposta.equalsIgnoreCase("yes")){
			//Action
			System.out.println("Do you prefer superhero or spy movies? (superhero/spy/other):");
			resposta = scanner.nextLine();
			
			
			if (resposta.equalsIgnoreCase("superhero")){
				System.out.println("You should watch 'Avengers: Endgame'.");
				
			} else if (resposta.equalsIgnoreCase("spy")){
				System.out.println("You should watch 'Mission: Impossible Fallout'.");
				
			} else if (resposta.equalsIgnoreCase("other")){
				System.out.println("You should watch 'Mad Max: Fury Road'.");
			}
		} else if (resposta.equalsIgnoreCase("no")){
			//Comedies
			System.out.println("Do you like comedies? (yes/no):");
			resposta = scanner.nextLine();
			
			
			if (resposta.equalsIgnoreCase("yes")){
				System.out.println("Do you prefer smart humor or silly humor? (smart/silly/other):");
				resposta = scanner.nextLine();
				
				if (resposta.equalsIgnoreCase("smart")){
					System.out.println("You should watch 'The Grand Budapest Hotel'.");
				}else if (resposta.equalsIgnoreCase("silly")) {
					System.out.println("You should watch 'The Hangover'.");
				}else if (resposta.equalsIgnoreCase("other")){
					System.out.println("You should watch 'The Mask'.");
				}
			}else if (resposta.equalsIgnoreCase("no")) {
				//Independent
				System.out.println("Do you like independent films? (yes/no)");
				resposta = scanner.nextLine();
				
				if (resposta.equalsIgnoreCase("yes")){
					System.out.println("Do you prefer drama or experimental style? (drama/experimental/other):");
					resposta = scanner.nextLine();
					
					if (resposta.equalsIgnoreCase("drama")){
						System.out.println("You should watch 'Lady Bird'.");
					}else if (resposta.equalsIgnoreCase("experimental")){
						System.out.println("You should watch 'Everything Is Illuminated'.");
					}else if (resposta.equalsIgnoreCase("other")) {
						System.out.println("You should watch 'Moonlight'.");
					}
				}else if (resposta.equalsIgnoreCase("no")){
					System.out.println("You should watch 'Home Alone'.");
				}
			}
		}
		
		
		
		System.out.println("Thanks for using the Movie Recommender!");
		scanner.close();
	}
}
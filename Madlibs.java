/**
 * 
 * @author Zachary Lo
 * CIS 36A
 *
 */

import java.util.Scanner;


public class Madlibs 
{
	public static void main(String[] args)
	{
		String mansName;
		String womansName;
		String adj1;
		String adj2;
		String color;
		String noun;
		String animal;
		String bodyPart;
		String holiday;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Welcome to Madlibs! \n\n");
		
		System.out.print("Enter a man's name: ");
		mansName = input.nextLine();
		
		System.out.print("Enter a woman's name: ");
		womansName = input.nextLine();
		
		System.out.print("Enter an adjective: ");
		adj1 = input.nextLine();
		
		System.out.print("Enter another adjective: ");
		adj2 = input.nextLine();
		
		System.out.print("Enter a color: ");
		color = input.nextLine();
		
		System.out.print("Enter a noun: ");
		noun = input.nextLine();
		
		System.out.print("Enter an animal: ");
		animal = input.nextLine();
		
		System.out.print("Enter a body part: ");
		bodyPart = input.nextLine();
		
		System.out.print("Enter a holiday: ");
		holiday = input.nextLine();
		
		System.out.println();
		
		System.out.println("The Haunted Tower \n\n");
		
		System.out.print("One afternoon " +mansName+ " and " +womansName+ " were walking down a(n) " +adj1+ " trail, looking for kindling for their campfire. The trees \n"
				+"were " +adj2+ " and " +color+ ", and there were colorful wildflowers all around. " +mansName+ " and " +womansName+ " began to pick the \n" 
				+"wildflowers, and after a while, they went so far that they had wandered away from the trail. \n" 
				
				+"\n"+ 
				
				"It started to get dark. " +mansName+ " began to get worried, but " +womansName+ " seemed excited to have an adventure. 'Look!' " +womansName+ 
				"\n"+ "said. 'Do you see that tower? It looks like a " +noun+ "! \n" 
				
				+"\n"+ 
				
				"'We're saved!' cried " +mansName+ ", who was relieved.\n" + 
				
				"\n"+ 
				
				"Once they got closer, " +mansName+ " felt very uneasy again. It didn't look like the cozy little cottage " +mansName+ " had been imagining, but rather \n" 
				+"a big, spooky tower! It was about 14 feet tall, and it was covered with green ivy and moss. It was the creepiest thing " +mansName+ " had ever seen!\n"
				
				+"\n"+ 
				
				mansName+ " said, '" +womansName+ " , let's keep walking! There's no way I'm going into that tower! It looks haunted!'\n" 
				
				+"\n"+ 
				
				"'Don't be such a(n) " +animal+ "! We're going in. I think it looks safe to me!' said " +womansName+ ". \n" 
				
				+"\n"+ 
				
				mansName+ " was so scared. He felt his " +bodyPart+ " chatter as " +womansName+ " opened the door. All of a sudden, " +mansName+ " felt that he was \n"
				+"not alone. He opened his eyes, prepared to see the worst. But instead, he saw all his friends and family inside the haunted tower! 'Surprise! \n"
				+holiday+ ", " +mansName+ "!' they all cried.");
		
		input.close();
	}
	
}

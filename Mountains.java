/**
 * 
 * @author Zachary Lo
 * CIS36A, Assignment 4.2
 *
 */
public class Mountains 
{
	public static int rheasilvia = 22000;
	public static int olympusMons = 21230;
	public static int maunaKea = 10200;
	public static int mtEverest = 5200;
	
	
	public static void main(String[] args)
	{
		System.out.println("Rheasilvia, on the asteroid Vesta, is " +rheasilvia+ " meters tall.");
		System.out.println("Olympus Mons, on Mars, is " +olympusMons+ " meters tall.");
		System.out.println("Mauna Kea, on Earth, is " +maunaKea+ " meters tall.");
		System.out.println("Mt Everest, on Earth, is " +mtEverest+ " meters tall.");
		
		int diffRheaMauna = rheasilvia - maunaKea; // 11800
		int diffRheaEverest = rheasilvia - mtEverest; // 16800
		System.out.println("Rheasilvia is " +diffRheaMauna+ " meters taller than Mauna Kea and " +diffRheaEverest+ " meters taller than Mt Everest.");
		
		
	}
}

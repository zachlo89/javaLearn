/**
 * 
 * @author Zachary Lo
 * CIS36A, Assignment 4.1
 *
 */
public class Friend 
{
	public static int yearsOfFriendship;
	public static char fnameInitial;
	public static char lnameInitial;
	public static double ageOfFriend;
	public static boolean isStudent;
	
	public static void main(String[] args) 
	{
//		int yearsOfFriendship;
		yearsOfFriendship = 8;
		System.out.println("I have known my friend for " +yearsOfFriendship+ " years.");
		
//		char fnameInitial;
		fnameInitial = 'R';
//		char lnameInitial;
		lnameInitial = 'A';
		System.out.println("My friend's initials are: " +fnameInitial+lnameInitial);
		
//		double ageOfFriend;
		ageOfFriend = 30.0;
		System.out.println("My friend is " +ageOfFriend+ " years old.");
		
//		boolean isStudent;
		isStudent = false;
		System.out.println("My friend is also a student at de Anza: " + isStudent);
	}
	
}

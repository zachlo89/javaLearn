/**
 * 
 * @author Zach Lo, Vishnu P
 * CIS 36A; Activity 17.2; JavaDoc Comments
 *
 */

public class Comments 
{
	/**
	 * 
	 * @param date
	 * @return boolean isLeapYear
	 */
	
   
    public static boolean isLeapYear(int date) 
    {
    	
        if (date % 4 == 0) 
        {
            return true;
        } else {
            return false;
        }
    }
   
    /**
     * 
     * @param first
     * @param initial
     * @param last
     * @return string formatName
     */
    
    public static String formatName(String first, char initial, String last) 
    {
        return first + " " + initial + ". " + last;
    }
   
    /**
     * 
     * @param radius
     * @return double areaCircle
     */
    public static double areaCircle(double radius) 
    {
        return Math.PI * radius * radius;
    }
       
    public static void main(String[] args) 
    {
        //assume rest of the program here
    }
}


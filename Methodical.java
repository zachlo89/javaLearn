/**
 * 
 * @author Zachary Lo
 * CIS 36A; Assignment 16.1; Getting Methodical
 *
 */

public class Methodical 
{
    /*
     * Given two int values, returns their sum.
     * Unless the two values are the same, then return double their sum.
     * sumDouble(1, 2) → 3
     * sumDouble(3, 2) → 5
     * sumDouble(2, 2) → 8
     */
   
    public static int sumDouble(int a, int b)
    {
    	if (a != b)
    	{
    		int sum = a + b;
    		return sum;
    	}
    	else 
    	{
    		int sum = (a + b) * 2;
    		return sum;
    	}
    }
   
    
    /*
     * Given 2 ints, a and b, return true if one of them is 10
     * or if their sum is 10.
     * makes10(9, 10) → true
     * makes10(9, 9) → false
     * makes10(1, 9) → true
     */

    public static boolean makes10(int a, int b)
    {
    	if (a == 10 || b == 10 || ((a + b) == 10)) 
    	{
    		return true;
    	}
    	
    	return false;
    }
    
    
    /*
     * We have two monkeys, a and b, and the parameters
     * aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling
     * or if neither of them is smiling.
     * Return true if we are in trouble.
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     */

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
    	if ((aSmile && bSmile) || (!aSmile && !bSmile))
    	{
    		return true;
    	}
    	return false;
    }
    
   

    /*
     * Return true if the given non-negative number is a multiple of 3
     * or a multiple of 5. Use the % "modulus" operator
     * or35(3) → true
     * or35(10) → true
     * or35(8) → false
     * */
    
    public static boolean or35(int num)
    {
    	if ((num % 3 == 0) || (num % 5 == 0))
    	{
    		return true;
    	}
    	return false;
    }


    /*
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * notString("candy") → "not candy"
     * notString("x") → "not x"
     * notString("not bad") → "not bad"
     */

    public static String notString(String str)
    {
    	if (str.length() > 1 && str.substring(0,3).equals("not"))
    	{
    		return str;
    	}
    	return "not " + str;
    }
    
    

    /*
     * Given a string, return a new string where the first and last chars have been exchanged
     * frontBack("code") → "eodc"
     * frontBack("a") → "a"
     * frontBack("ab") → "ba"
     */
    
    public static String frontBack(String str) 
    {
    	int len = str.length();
    	char firstChar = str.charAt(0);
    	char lastChar = str.charAt(str.length()-1);
    	
    	if (len <= 1)
    	{
    		return str;
    	}
    	else
    	{
    		return lastChar + str.substring(1, len - 1) + firstChar;
    	}
    	
    }
   
    /*
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values, return true if 1 or more of them is/are teen.
     * hasTeen(13, 20, 10) → true
     * hasTeen(20, 19, 10) → true
     * hasTeen(20, 10, 13) → true
     */

    public static boolean hasTeen(int num1, int num2, int num3) 
    {
    	if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19))
    	{
    		return true;
    	}
    	
    	return false;
    }
   



    public static void main(String[] args)
    {
        int result;
        boolean answer;
        String value;
        
        System.out.println("***Testing sumDouble***\n");
        result = sumDouble(1, 2);
        System.out.println("Should print 3: " + result);
        result = sumDouble(3, 2);
        System.out.println("Should print 5: " + result);
        result = sumDouble(2, 2);
        System.out.println("Should print 8: " + result +"\n");
      
        System.out.println("***Testing makes10***\n");
        answer = makes10(9, 10);
        System.out.println("Should be true: " + answer);
        answer = makes10(9, 9);
        System.out.println("Should be false: " + answer);
        answer = makes10(1, 9);
        System.out.println("Should be true: " + answer + "\n");
          
        System.out.println("***Testing monkeyTrouble***\n");
        answer = monkeyTrouble(true, true);
        System.out.println("Should be true: " + answer);
        answer = monkeyTrouble(false, false);
        System.out.println("Should be true: " + answer);
        answer = monkeyTrouble(true, false);
        System.out.println("Should be false: " + answer + "\n");
      
        System.out.println("***Testing or35***\n");
        answer = or35(3);
        System.out.println("Should be true: " + answer);
        answer = or35(10);
        System.out.println("Should be true: " + answer);
        answer = or35(8);
        System.out.println("Should be false: " + answer + "\n");
      
        System.out.println("***Testing notString***\n");
        value = notString("candy");
        System.out.println("Should be not candy: " + value);
        value = notString("x");
        System.out.println("Should be not x: " + value);
        value = notString("not bad");
        System.out.println("Should be not bad: " + value + "\n");
      
        System.out.println("***Testing frontBack***\n");
        value = frontBack("code");
        System.out.println("Should be eodc: " + value);
        value = frontBack("a");
        System.out.println("Should be a: " + value);
        value = frontBack("ab");
        System.out.println("Should be ba: " + value + "\n");
      
        System.out.println("***Testing hasTeen***\n");
        answer = hasTeen(13, 20, 10);
        System.out.println("Should be true: " + answer);
        answer = hasTeen(20, 19, 10);
        System.out.println("Should be true: " + answer);
        answer = hasTeen(20, 10, 13) ;
        System.out.println("Should be true: " + answer);
        answer = hasTeen(20, 10, 45) ;
        System.out.println("Should be false: " + answer + "\n");
      
        System.out.println("***End of Tests***");
      
    }
   
}

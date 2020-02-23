/*
 * @author Zachary Lo
 * CIS 36A; Assignment 17.2; More Method Practice
 *
 */

import java.util.Scanner;

public class MorePractice 
{
    /**
     * Given a String, take the last char and return a new String with the last char added at the front and back,
     * so "cat" yields "tcatt". The original String will be length 1 or more.
     * wrapAround("cat") → "tcatt"
     * wrapAround("Hello") → "oHelloo"
     * wrapAround("a") → "aaa"
     * @param str the input String
     * @return a new String with the last char added to front and back
     */
  
    public static String wrapAround(String str) 
    {
        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);        
    }
  
    
    /**
     * Given 2 strings, a and b, return a String of the form short+long+short,
     * with the shorter String on the outside and the longer String on the inside.
     * The Strings will not be the same length, but they may be empty (length 0).
     * combineString("Hello", "hi") → "hiHellohi"
     * combineString("hi", "Hello") → "hiHellohi"
     * combineString("aaa", "b") → "baaab"
     * @param a the first String to combine
     * @param b the second String to combine
     * @return a new String short+long+short
    */
    
    
    public static String combineString(String a, String b)
    {
    	String newStr = "";
    	
		if (a.length() > b.length()) 
    	{
    		newStr =  b.substring(0) + a + b.substring(0);
    	}
		else
		{
			newStr =  a.substring(0) + b + a.substring(0);
		}
		return newStr;
    }
  
    
    /**
     * Given a String of even length, return a String
     * made of the middle two chars, so the String
     * "string" yields "ri".
     * Note: You can assume the String length will be at least 2.
     * middleChars("string") → "ri"
     * middleChars("code") → "od"
     * middleChars("Practice") → "ct"
     * @param str the String to extract the middle
     * @return the middle of the String
     */
    public static String middleChars(String str)
    {
    	int pos;
    	int len;
    	
    	if (str.length() % 2 == 0) 
    	{
    		pos = str.length() / 2 - 1;
    		len = 2;
    	}
    	else
    	{
    		pos = str.length() / 2;
    		len = 2;
    	}
    	
        return str.substring(pos, pos + len);
    }

    
    /**
     * Given a string, return a new String made of 3 copies of the last 2 chars of the original String.
     * The String length will be at least 2.
     * anotherEnd("Hello") → "lololo"
     * anotherEnd("ab") → "ababab"
     * anotherEnd("Hi") → "HiHiHi"
     * @param str the String to copy
     * @return the repeated characters
     */
    public static String anotherEnd(String str) 
    {
    	String newStr1 = "";
    	String newStr2 = "";
    	
        newStr1 = (str.substring(str.length() - 2));
        newStr2 = newStr1 + newStr1 + newStr1;
        
        return newStr2;
    }
   
    
    /**
     * Given a String, determines whether the given character is in the String
     * contains('@', "bob@jobs.com") → true
     * contains('@', "bobajobs.com") → false
     * contains('2', "tr2dat") → true
     * @param c the character to locate in the String
     * @param s the String to search
     * @return whether c is in s
     */
    public static boolean contains(char c, String s) 
    {
        for (int i = 0; i < s.length(); i++) 
        {
        	if (s.charAt(i) == c) 
        	{
        		return true;
        	}
        }
        
        return false;
    }
  

    public static void main(String[] args)
    {
        String value;
        boolean b;
        System.out.println("***Testing wrapAround***\n");
        value = wrapAround("cat");
        System.out.println("Should print tcatt: " + value);
        value = wrapAround("Hello");
        System.out.println("Should print oHelloo: " + value);
        value = wrapAround("a");
        System.out.println("Should print aaa: " + value +"\n");
     
        System.out.println("***Testing combineString***\n");
        value = combineString("Hello", "hi");
        System.out.println("Should be hiHellohi: " + value);
        value = combineString("hi", "Hello");
        System.out.println("Should be hiHellohi: " + value);
        value = combineString("aaa", "b");
        System.out.println("Should be baaab: " + value + "\n");
         
        System.out.println("***Testing middleChars***\n");
        value = middleChars("string");
        System.out.println("Should be ri: " + value);
        value = middleChars("code");
        System.out.println("Should be od: " + value);
        value = middleChars("Practice");
        System.out.println("Should be ct: " + value + "\n");
     
        System.out.println("***Testing anotherEnd***\n");
        value = anotherEnd("Hello");
        System.out.println("Should be lololo: " + value);
        value = anotherEnd("ab");
        System.out.println("Should be ababab: " + value);
        value = anotherEnd("feet");
        System.out.println("Should be etetet: " + value + "\n");
       
        System.out.println("***Testing contains***\n");
        b = contains('@', "bob@jobs.com");
        System.out.println("Should be true: " + b);
        b = contains('@', "bobajobs.com");
        System.out.println("Should be false: " + b);
        b = contains('2', "tr2dat");
        System.out.println("Should be true: " + b);
     
        System.out.println("***End of Tests***");

      
    }
  

}
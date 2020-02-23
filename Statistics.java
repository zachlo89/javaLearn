/**
 * 
 * @author Zachary Lo
 * CIS 36A; Activity 19.3: Sonnet Statistics
 *
 */

import java.io.*;
import java.util.Scanner;

public class Statistics 
{

    /**
     * @param args the command line arguments
     */
	
    public static void main(String[] args) throws IOException
    {
    	File infile = new File("sonnet.txt");
    	File outfile = new File("statistics.txt");
    	
    	Scanner input = new Scanner(infile);
    	
        int count = 0;
        String word, line;

        
        while (input.hasNext()) 
        {
        	word = input.next();
        	count++;
        }
        input.close();
        PrintWriter output = new PrintWriter(outfile); 
        output.println("The sonnet has " + count + " words");
        
        
        // ***********************************
        
        
        // nn another input to read another file to count num of lines
        input = new Scanner(infile);
        
        // reset count to 0
        count = 0;
        
        while (input.hasNextLine()) 
        {
        	line = input.nextLine();
        	count++;
        }
        input.close();
        output.println("The sonnet has " + count + " lines");
        
        output.close();
    }

}

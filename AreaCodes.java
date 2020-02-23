/**
 * 
 * @author Zach Lo
 * CIS 36A; Customer Data: Area Codes
 *
 */


import java.io.*;
import java.util.Scanner;

public class AreaCodes 
{
    public static void main(String[] args) throws IOException //update to throw exception
    {
        String firstName;
        String lastName;
        String gender;
        String phone;
        String[] custIn831Arr;
        String[] custIn408Arr;
        String allInfo;
        final String FILE_NAME;
        final int ARRAY_SIZE;
        //Use below variables to keep track of array index inside while loop
        int i = 0; // 831 pos of arr
        int j = 0; // 408 pos of arr
        
     
        //prompt user for file name  
        System.out.print("Welcome!\nPlease enter the name of an input file: ");
        
        //Declare File and Scanner for reading from the file
        Scanner userInput = new Scanner(System.in);
        FILE_NAME = userInput.nextLine();
        
        File customer = new File(FILE_NAME); // customer is an []
        Scanner inputArr = new Scanner(customer);
        //Note: No PrintWriter should be used in main
        
        //declare your two arrays
        ARRAY_SIZE = inputArr.nextInt();
        custIn831Arr = new String[ARRAY_SIZE / 2];
        custIn408Arr = new String[ARRAY_SIZE / 2];

        while (inputArr.hasNextLine())
        {
            //read in name and gender
            firstName = inputArr.next();
            lastName = inputArr.next();
            gender = inputArr.next();
//            System.out.println("gender"+gender);
            
            //if statements related to gender
            if (gender.equalsIgnoreCase("f"))
            {
            	gender = "Ms.";
            }
            else if (gender.equalsIgnoreCase("m"))
            {
            	gender = "Mr.";
            }
            else
            {
            	gender = "Mx.";
            }
            
            //read in phone
            phone = inputArr.next();
            
            String formattedPhoneNum = validatePhone(phone);
//            System.out.println("formattedPhoneNum"+formattedPhoneNum);
            allInfo = gender + " " + firstName + " " + lastName + ": " + formattedPhoneNum;
//            System.out.println("allInfo"+allInfo);
            
            //if statements for phone
            if (phone.substring(0,3).equals("831")) 
            {
            	custIn831Arr[i] = allInfo;
            	i++;
            }
            else if (phone.substring(0,3).equals("408")) 
            {
            	custIn408Arr[j] = allInfo;
            	j++;
            }
//            System.out.println("stringArr"+custIn831Arr[0]);
            printArray(custIn408Arr, "SantaClaraCounty2.txt");
            printArray(custIn831Arr, "SantaCruzCounty2.txt");
            
        }
        // close both Scanners
        inputArr.close();
        userInput.close();
        
        System.out.println("Thank you!\n"
        		+ "Please check SantaClaraCounty2.txt and SantaCruzCounty2.txt"
        		+ " for customer data.");
    }
   
          //write Javadoc comment here
    /**
     * 
     * @param phone takes in the mashed ph num 
     * @return String of formatted phone num
     */
    public static String validatePhone(String phone)
    {
        if (phone.length() != 10) 
        {
        	return phone + " (invalid)";
        }
        
        String areaCode = phone.substring(0,3);
        String middle = phone.substring(3,6);
        String end = phone.substring(6);
        
        return "(" + areaCode + ")" + middle + "-" + end;
    }
   
    
          //write Javadoc comment here
    /**
     * 
     * @param customerArr array for customers
     * @param outFile file that writes out to with info
     * @throws IOException
     */
    public static void printArray(String[] customerArr, String outFile) throws IOException//update to throw Exception
    {
        //PrintWriter needed in this method, not in main
    	File out = new File(outFile);
    	PrintWriter output = new PrintWriter(out);
    	
    	for (int i = 0; i < customerArr.length; i++)
    	{
    		output.println(customerArr[i]);
    	}
    	// close PrintWriter
    	output.close();
    	
    }
}

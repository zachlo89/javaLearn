/**
 * 
 * @author Zachary Lo
 * CIS 36A; Assignment 17.1; Taco Stand
 *
 */

import java.util.Scanner;

public class TacoStand 
{
	
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
        int numTacos;
        int numHorchatas;
        int numNachos;

        final double PRICE_TACOS = 4.25;
        final double PRICE_HORCHATAS = 5.00;
        final double PRICE_NACHOS = 14.50;
        final double SUBTOTAL = 0.0;
        final double TIP;
       
        String choice;
       
        System.out.println("Welcome to our Taco Stand!\n");
        System.out.print("Enter the number of tacos: ");
        numTacos = input.nextInt();
       
        System.out.print("Enter the number of nachos: ");
        numNachos = input.nextInt();
       
        System.out.print("Enter the number of horchatas: ");
        numHorchatas = input.nextInt();
       
        
        //Add more code here!
        input.nextLine();
        
        System.out.print("Would you like to tip: " + "\nA: 10%" 
        		+ "\nB: 15%" 
        		+ "\nC: 20% \n\n");
        
        System.out.print("Enter your choice: ");
        choice = input.next();
        
        double tacoCost = numTacos * PRICE_TACOS;
        double horchataCost = numHorchatas * PRICE_HORCHATAS;
        double nachoCost = numNachos * PRICE_NACHOS;
        double foodCost = tacoCost + horchataCost + nachoCost;
        
        
        if (choice.equalsIgnoreCase("A"))
        {        	
        	System.out.print("You selected 10%");
        	TIP = 0.10;
        }
        else if (choice.equalsIgnoreCase("B"))
        {        	
        	System.out.print("You selected 15%");
        	TIP = 0.15;
        }
        else if (choice.equalsIgnoreCase("C"))
        {        	
        	System.out.print("You selected 20%");
        	TIP = 0.20;
        }
        else
        {
        	System.out.print("You selected 20%");
        	TIP = 0.20;
        }
        

		//        System.out.print("With taxes and tip, your total comes to " + printTotal(foodSubTtl, percentTip));
         printTotal(foodCost, TIP);
    
        
        
        System.out.println("\n\nThank you! Please come again!");
    }
    
    //Write your methods AND JAVADOC COMMENTS here
    
    /**
     * TAX AMT tks double; calcs tax; adds tax to total price
     * @param double; subTotal; as double for food
     * @return double; updated price; tax and sub total
     * 
     */
    public static double calcTax(double foodSubTtl)
    {
    	double updatedPrice = 0;
    	double tax = 1.0925;
   
    	updatedPrice = foodSubTtl * tax;
    	
    	return updatedPrice;
    }
    
    
    /**
     * TIP AMT tks double; for curr bill (price of food + tax); calc tip and adds to total price
     * @param double currBill with no tip
     * @param double tip percentage
     * @return double updated price of tip and total
     * curr bill is price of food + tax
     * 
     */
    public static double calcTip(double currBill, double percentTip)
    {
    	double tipAmt = 0.0; 
    	double totalTip = 0.0;
    	
    	tipAmt = currBill * percentTip;
    	totalTip = currBill + tipAmt;
    	
    	return totalTip;
    }
    
    
    /**
     * TOTAL WITH TAX AND TIP; calls calcTax adds taxes to price
     * calls calcTip and adds the tip to price
     * displays price to two decimals with msg...
     * @param double; food sub total aka food price
     * @param double; tip percentage
     */
    public static void printTotal(double foodSubTtl, double percentTip)
    {
    	double myTax = 0.0;
    	double myTip = 0.0;
    	
    	myTax = calcTax(foodSubTtl);
    	myTip = calcTip(myTax, percentTip);
    	System.out.printf("\n\nWith taxes and tip, your total comes to %.2f", myTip);
    }
}


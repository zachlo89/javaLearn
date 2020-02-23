/**
 * Activity 20.1
 * @author VishnuP
 * @author ZachL
 * CIS 36A
 */


public class MoreArrayMethods {
    
    /**
     * Return the sum of the first two elements in
     * the array
     * If the array is smaller than length 2, you can
     * return the lone element stored in the array
     * If the array is empty, you should return 0
     * @param nums the array of numbers
     * @return the sum of the first two elements in the array
     * Test cases:
     * sumUp2({1, 2, 3, 4, 5} -> 3
     * sumUp2({10}) -> 10
     * sumUp2({}) -> 0
     */
    public static int sumUp2(int[] array) 
    {
    	int sum = 0;
    	
    	if (array.length > 2) 
    	{
    		sum = array[0] + array[1];
            return sum;
    	}
    	else if (array.length == 0 ) 
    	{
    		return 0;
    	}
    	
    	return array[0];
    }
​
    /**
    * Return the index of the first appearance of the
    * number 42 in any array. If not found return -1.
    * @param data array of ints
    * @return the index of the first number 42, -1 if not found.
    * Test cases:
    * locateFirst42({1, 1, 42, 3, 1}) --> 2
    * locateFirst42({1, 1, 2, 42, 1}) --> 3
    * locateFirst42({1, 1, 2, 1, 2, 3}) --> -1
    */
    public static int locateFirst42(int[] data) 
	{
	  for (int i =0; i < data.length; i++) 
	  {
		 if (data[i] == 42) 
		 {
			 return i; 
		 }   
	  }
	  
	  return -1;
	}

    /**
     * Given an array of ints, return true if
     * the sequence .. 1, 2, 3, .. appears
     * in the array somewhere.
     * @param data array of ints
     * @return true if .. 1, 2, 3, .. appears in the array,
     * false otherwise.
     * Test cases:
     * contains123({1, 2, 3, 1}) --> true
     * contains123({1, 2, 4, 1}) --> false
     * contains123({1, 2, 1, 2, 3}) --> true
     */
    public static boolean contains123(int[] data) 
    {
    	for (int i = 0; i < data.length - 1; i++)
    	{
    		if ((data[i] == 1) && (data[i+1] == 2) && (data[i+2] == 3))
	    	 {
    		 	return true;
	    	 }
    	}
    	return false;
    }
​
    /**
     * Prints all the elements in an array to the console
     * on one line with a space between each element.
     * @param data The array to print.
     */
    public static void printArray(int[] data) 
	{
      for (int i = 0; i < data.length; i++)
      {
    	  System.out.print(data [i] + " ");
      }
      
      System.out.println();
    }
​
    /**
     * Given an array of ints, delete first appearance of the number 42.
     * By replacing it with a 0.
     * If the number does not exist in the array, leave the array unchanged.
     * @param data array of ints
     * Hint: use return; to end the method early!
     * Test cases:
     * deleteFirst42({1, 2, 42, 3, 1}) --> {1, 2, 0, 3, 1}
     * deleteFirst42({1, 2, 3, 42, 42, 1}) --> {1, 2, 3, 0, 42, 1}
     * deleteFirst42({1, 2, 3}) --> {1, 2, 3}
     */
    public static void deleteFirst42(int[] data) 
	{
		for (int i = 0; i < data.length; i++) 
		{
    		if (data[i] == 42) 
    		{
    			data [i] = 0;
    			return;
    		}
    	}
    }
​
    /**
    * Alters the given array such that the first and last elements are swapped
    * @param an array of ints
    * Note you can assume you will be given an array of length >= 1
    * Test cases:
    * reverseFirstLast([1, 2, 3, 4]) → [4, 2, 3, 1]
    * reverseFirstLast([1, 2, 3]) → [3, 2, 1]
    * reverseFirstLast([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
    */
    public static void reverseFirstLast(int[] data) 
	{
    	int first = data[0];
    	int last = data[data.length-1];
    	
    	data[0] = last;
    	data[data.length -1] = first;
    	
    	return;
    }




    public static void main(String[] args) {
        boolean answer = false;
        int num = 0;
        
        final int A3 = 3, A42 = 42;
        int[] data1 = { 1, 2, A42, A3, 1 };

        System.out.println("***Testing sumUp2***");
        num = sumUp2(data1);
        System.out.println("sumUp2 should be 3: " + num);
        int[] data = {10};
        num = sumUp2(data);
        System.out.println("sumUp2 should be 10: " + num);
        int[] empty = {};
        num = sumUp2(empty);
        System.out.println("sumUp2 should be 0: " + num);
        
        System.out.println("***Testing locateFirst42***");
        num = locateFirst42(data1);
        System.out.println("locateFirst42a should be 2: " + num);
        int[] data2 = { 1, 1, 2, A42, 1 };
        num = locateFirst42(data2);
        System.out.println("locateFirst42a should be 3: " + num);
        int[] data3 = { 1, 1, 2, 1, 2 };
        num = locateFirst42(data3);
        System.out.println("locateFirst42a should be -1: " + num);
​
        System.out.println("\n***Testing contains123***");
        final int A4 = 4;
        int[] data4 = { 1, 2, A3, 1 };
        answer = contains123(data4);
        System.out.println("contains123 should be true: " + answer);
        int[] data5 = { 1, 2, A4, 1 };
        answer = contains123(data5);
        System.out.println("contains123 should be false: " + answer);
        int[] data6 = { 1, 2, 1, 2, A3 };
        answer = contains123(data6);
        System.out.println("contains123 should be true: " + answer);
​
        System.out.println("\n***Testing printArray***");
        System.out.println("printArray1 should be 1 2 3 1: ");
        printArray(data4);
        System.out.println("printArray2 should be 1 2 4 1: ");
        printArray(data5);
        final int A7 = 7;
        int[] data7 = { A7 };
        System.out.println("printArray1 should be 7: ");
        printArray(data7);
​
        System.out.println("\n***Testing deleteFirst42***");
        deleteFirst42(data1);
        System.out.println("deleteFirst42 should be 1 2 0 3 1: ");
        printArray(data1);
        int[] data8 = { 1, 2, A3, A42, A42, 1 };
        deleteFirst42(data8);
        System.out.println("deleteFirst42 should be 1 2 3 0 42 1: ");
        printArray(data8);
        int[] data9 = { 1, 2, A3 };
        deleteFirst42(data9);
        System.out.println("deleteFirst42 should be 1 2 3: ");
        printArray(data9);
​
        System.out.println("\n***Testing reverseFirstLast***");
        int[] data10 = { 1, 2, 3, 4 };
        reverseFirstLast(data10);
        System.out.println("reverseFirstLast should be 4 2 3 1: ");
        printArray(data10);
        reverseFirstLast(data9);
        System.out.println("reverseFirstLast should be 3 2 1: ");
        printArray(data9);
        int[] data11 = {8, 6, 7, 9, 5};
        reverseFirstLast(data11);
        System.out.println("reverseFirstLast should be 5 6 7 9 8: ");
        printArray(data11);
       
        System.out.print("\n***End of Tests***");
    }
}
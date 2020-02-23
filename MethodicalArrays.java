/**
 * 
 * @author Zach Lo
 * CIS 36A; Assignment 19.1; Methods + Arrays
 *
 */


public class MethodicalArrays 
{
	// ******************
	/**
     * Displays the contents of an array on the console
     * with each element separated by a blank space
     * Prints a new line character last
     * @param nums the array to print to the console
     */
    public static void printArray(int[] nums) 
    {
        for (int i = 0; i < nums.length; i++)
        {
        	System.out.print(nums[i] + " ");
        }
    }

    
    /**
    * Assuming an array of integers, return true if 1
    * is the first element or 1 is the last element
    * Note: you may assume that you will be given an array
    * of at least length 1
    * is1FirstLast([1, 2, 10]) → true
    * is1FirstLast([10, 1, 2, 1]) → true
    * is1FirstLast([13, 10, 1, 2, 3]) → false
    * @param numbers the array of int numbers
    * @return whether or not 10 is the first or last element
    */
    public static boolean is1FirstLast(int numbers[]) 
    {
        for (int i = 0; i < numbers.length; i++) 
        {
        	if (numbers[0] == 1|| (numbers[numbers.length - 1]) == 1)
        	{
        		return true;
        	}
        }
        
    	return false;
    }
   
    
    /**
    * Given an array of int numbers, return true
    * if the array is size 1 or more,
    * AND the first element and the last element are the same.
    * sameFirstLast([1, 2, 3]) → false
    * sameFirstLast([1, 2, 3, 1]) → true
    * sameFirstLast([1, 2, 1]) → true
    * @param numbers the array of integers
    * @return whether the first and last element are the same
    */
    public static boolean sameFirstLast(int[] numbers)
    {
        if (numbers.length >= 1 && (numbers[0] == (numbers[numbers.length - 1])))
        {
        	return true;
        }
        
    	return false;
    }
   
    
    // ******************
    /**
    * Given an array of int numbers, add 10 to each element in the array
    * return nothing.
    * arrayAdd10([1,2,3]) -> [11, 12, 13]
    * arrayAdd10([10, 30, 50, 79, 85]) -> [20, 40, 60, 89, 95]
    * arrayAdd10([5]) -> [15]
    * @param array the array of integer values
    */
    public static void arrayAdd10(int[] array) 
    {
        for (int i = 0; i < array.length; i++) 
        {
        	array[i] = (array[i] + 10);
        }
    }
   
    
    //******************
    /**
     * Given an array of ints numbers, multiply each element in the array by itself
     * arraySquared([1,2,3]) -> [1, 4, 9]
     * arraySquared([9, 10, 11, 12]) -> [81, 100, 121, 144]
     * arraySquared([151]) -> [22801]
     * @param array the array of integer values
     */
    public static void arraySquared(int[] array)
    {
        for (int i = 0; i < array.length; i++) 
        {
        	array[i] *= array[i];
        }
    }
   

    
    public static void main(String[] args)
    {
     
        boolean answer;
     
        System.out.println("***Testing is1FirstLast***\n");
        int array1[] = {1, 2, 10};
        answer = is1FirstLast(array1);
        System.out.println("Should print true: " + answer);
        int array2[] = {10, 1, 2, 1};
        answer = is1FirstLast(array2);
        System.out.println("Should print true: " + answer);
        int array3[] = {13, 10, 1, 2, 3};
        answer = is1FirstLast(array3);
        System.out.println("Should print false: " + answer);
        System.out.println();

        System.out.println("***Testing sameFirstLast***\n");
        int array4[] = {1, 2, 3};
        answer = sameFirstLast(array4);
        System.out.println("Should print false: " + answer);
        int array5[] = {10, 20, 50, 60, 80, 90, 10};
        answer = sameFirstLast(array5);
        System.out.println("Should print true: " + answer);
        int array6[] = {1};
        answer = sameFirstLast(array6);
        System.out.println("Should print true: " + answer);
        System.out.println();

        System.out.println("***Testing arrayAdd10***\n");
        int array7[] = {1, 2, 3};
        arrayAdd10(array7);
        System.out.println("Should print 11 12 13: ");
        printArray(array7);
        System.out.println();
        int array8[] = {10, 30, 50, 79, 85};
        arrayAdd10(array8);
        System.out.println("Should print 20 40 60 89 95: ");
        printArray(array8);
        System.out.println();
        int array9[] = {5};
        arrayAdd10(array9);
        System.out.println("Should print 15: ");
        printArray(array9);
        System.out.println("\n");

        System.out.println("***arraySquared***\n");
        int array10[] = {1, 2, 3};
        arraySquared(array10);
        System.out.println("Should print 1 4 9: ");
        printArray(array10);
        System.out.println();
        int array11[] = {9, 10, 11, 12};
        arraySquared(array11);
        System.out.println("Should print 81 100 121 144: ");
        printArray(array11);
        System.out.println();
        int array12[] = {151};
        arraySquared(array12);
        System.out.println("Should print 22801: ");
        printArray(array12);
        System.out.println("\n");

        System.out.println("***End of Tests***");
      
    }
}

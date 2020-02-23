/*
 * @author Vishnu Palaniappan
 * @author Zachary lo
 * CIS 36A
 *
 */
public class Methodic {
	public static double areaRectangle (double length, double width)
	{
		double areaR = length * width;
		return areaR;
	}
	public static double areaTriangle (double base, double height)
	{
		double areaT = 0.5 * (base * height);
		return areaT;
	}
	public static int minNum (int num1, int num2)
	{
		if (num1 > num2){
			return num2;
		}
		else {
			return num1;
		}
	}
	public static String firstLetter (String hello)
	{
		String firstC = hello.substring(0, 1);
		return firstC;
	}
	
	public static void main(String[] args) {
		System.out.println("***Testing areaRectangle***\n");
		System.out.printf("Should print 15.0: %.1f\n", areaRectangle(5.0, 3.0));
		System.out.printf("Should print 5.3: %.1f\n", areaRectangle(3.5, 1.5));
		System.out.println();

		System.out.println("***Testing areaTriangle***\n");
		System.out.printf("Should print 7.5: %.1f\n", areaTriangle(5.0, 3.0));
		System.out.printf("Should print 2.6: %.1f\n", areaTriangle(3.5, 1.5));
		System.out.println();

		System.out.println("***Testing minNum***\n");
		System.out.println("Should print 2: " + minNum(9, 2));
		System.out.println("Should print 9: " + minNum(9, 9));
		System.out.println("Should print 2: " + minNum(2, 9));
		System.out.println();

		System.out.println("***Testing firstLetter***\n");
		System.out.println("Should print A: " + firstLetter("Abracadabra"));
		System.out.println("Should print z: " + firstLetter("zebra"));
		System.out.println("Should print h: " + firstLetter("hello there!"));
		System.out.println();

		System.out.println("***End of Tests***");

	}
}
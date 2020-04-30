
	import java.util.Arrays;

	/**
	 * CSC402Homework2  version 1.0
	 * 
	 *   Your Name goes here: Giries Hattar
	 *   You class section  goes here: ......
	 *   
	 * 
	 * This is a skeleton file for your programming assignment. Edit the sections marked TODO. 
	 *
	 * Unless specified otherwise, you must not change the declaration of any method. 
	 * This will be true of every skeleton file I give you.
	 *
	 * For example, you will get zero points if you change the line
	 * <pre>
	 *     public static double valRange (double[] list)
	 * </pre>
	 * to something like
	 * <pre>
	 *     public static void valRange (double[] list)
	 * </pre>
	 * or
	 * <pre>
	 *     public static double valRange (double[] list, int i) {
	 * </pre>
	 * 
	 * Each of the functions below is meant to be SELF CONTAINED. This means that
	 * you should use no other functions or classes.  You should not use any HashSets
	 * or ArrayLists, or anything else unless specifically indicated! 
	 * Exception: You may use Math.abs  (look it up) 
	 */
	public class CSC402Homework2 {

		public static double valRange (double[] list) { 
		//return -1; //TODO 1:  fix this
		double max = list[0];
		double min = list[0];
		
		//Finding max
			for (int i = 0; i < list.length; i++) {
				if(list[i] > max)
				{
					max = list[i];
				}
			}
		for (int i = 0; i < list.length; i++) {
				if(list[i] < min)
				{
					min = list[i];
				}
		}
			return(max-min);
		}

		public static int minPosition (double[] list) {
			//return -1; //TODO 2: fix this
			
			double min = list[0];
			int index = 0;
			for (int i = 0;i< list.length; i++) {
					if(list[i] < min)
					{
						min = list[i];
						index = i;
					}
			}	
			return(index);
		}
		public static String stringReformat( String name) {
			int commaIndex = 0;
			for(int i = 0; i < name.length(); i++)
			{
				if(name.charAt(i) == ',')
				{
					commaIndex = i;
				}
			}
			String lastName = name.substring(0, commaIndex);
			String firstName = name.substring(commaIndex + 2, (name.length() - 1));
			String theAnswer =  firstName + " " + lastName;
		
			return theAnswer;   // TODO 3:  fix this.
		}
	
		public static boolean isPerfectNumber( int number) {
		
		int divisorsSum = 0;
		for(int i = 1; i < number; i++)
		{
			if (number % i == 0 )
			{
				divisorsSum += i;
			}
		}	
			if (divisorsSum == number)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		/*
		 * A test program, using private helper functions.  See below.
		 */
		public static void main (String[] args) {
			// do all the tests
			valueRangeTests();
			minPositionTests();
			stringReformatTests();
			perfectNumberTests();
			System.out.println("Finished tests");
		}

		/* Test functions --- lot's of similar code!    Do not change any of the code below*/
		
		
		private static void valueRangeTests() {
			// for ValRange: array must be nonempty
			testValRange (0, new double[] {11} );
			testValRange (0, new double[] { 11,11,11,11,11} );
			testValRange (10, new double[] {11, 1} );
			testValRange (10, new double[] {1,11} );
			testValRange (32, new double[] {11, 21, 9, 31, 41});
			testValRange (32, new double[] {41, 21, 9, 31, 11});
			testValRange (32, new double[] {11, 41, 9, 31, 21});
			testValRange (32, new double[] {-41, -21, -11, -31, -9});
			testValRange (32, new double[] {-9, -21, -11, -31, -41});
			testValRange (32, new double[] {-41, -11, -9, -31, -21});
			testValRange (32, new double[] {-11, -21, -41, -31, -9});		
			testValRange (0.7, new double[] { 0.2, -0.5, -0.1});
			System.out.println();
		}
		private static void testValRange (double expected, double[] list) {
			double actual = valRange (list);  // calls your function

			if (expected != actual) {   // compares your result with the expected result
				System.out.printf("Failed valRange(%s): Expecting (%.1f) Actual (%.1f)\n", Arrays.toString(list), expected, actual);
			}
		}
		private static void minPositionTests() {
			// for distanceBetweenMinAndMax: array must be nonempty with unique elements
			testMinPosition (0, new double[] {11});
			testMinPosition (0, new double[] {-11});
			testMinPosition (0, new double[] {9, 11, 21, 31, 41});
			testMinPosition (1, new double[] {11, 9, 21, 31, 41});
			testMinPosition (2, new double[] {11, 21, 9, 31, 41});
			testMinPosition (3, new double[] {11, 21, 31, 9, 41});
			testMinPosition (4, new double[] {11, 21, 31, 41, 9});
			testMinPosition (4, new double[] {9, -11, -21, -31, -41});
			testMinPosition (4, new double[] {-11, -21, -31, 9, -41});
			testMinPosition (3, new double[] {-11, -21, -31, -41, 9});
			testMinPosition (2, new double[] {1, -4, -7, 7, 8, 11, 9, -5});
			testMinPosition (1, new double[] {0.2, -0.5, -0.1});

			System.out.println();
		}

		private static void testMinPosition (int expected, double[] list) {

			int actual = minPosition (list); // calls your function

			if (expected != actual) { // compares your result with the expected result
				System.out.printf("Failed testMinPosition(%s): Expecting (%d) Actual (%d)\n", Arrays.toString(list), expected, actual);
			}
		}	
		private static void stringReformatTests() {

			testStringReformat( "Keaton, Alex P.", "Alex P Keaton");
			testStringReformat( "Boyd, Luke A.", "Luke A Boyd");
			testStringReformat("Essen, Lotta B.", "Lotta B Essen");
			testStringReformat("Rittenoff, Candace B.", "Candace B Rittenoff");
			testStringReformat("Blank, Drew A.", "Drew A Blank");
			testStringReformat("Bruptly, Vera A.", "Vera A Bruptly");
			testStringReformat("Datso, Wanda Y.", "Wanda Y Datso");
			testStringReformat("Silver, I O.", "I O Silver");

		}
		private static void testStringReformat (String stringToTest, String expected) {

			String actual = stringReformat( stringToTest);    // calls your function

			if ( ! actual.equals(expected))        // compares your result with the expected result
				System.out.printf("Failed  testStringReformat:  Expected: (%s)  Actual (%s) \n", expected, actual);

		}
		private static void perfectNumberTests() {

			testPerfectNumber( 20,false);
			testPerfectNumber( 28,true);
			testPerfectNumber( 496,true);
			testPerfectNumber( 495,false);
			testPerfectNumber( 8128,true);
			testPerfectNumber( 33550336,true);

		}
		private static void testPerfectNumber (int number, boolean expected) {

			boolean actual = isPerfectNumber(number);    // calls your function

			if ( actual != expected)        // compares your result with the expected result
				System.out.printf("Failed  testPerfectNumber:  Expected: (%b)  Actual (%b) \n", expected, actual);

		}

	}


public class MainSquare {

	public static void main(String[] args) {
		Square mySquare; // Declaration
		mySquare = new Square(3, new Point(1,1)); // Creation
		System.out.println(mySquare); // Use
		
		System.out.println();
		System.out.println("Let's play with a primitive data type...");
		int whichSize;
		whichSize = mySquare.getSize();
		System.out.println("whichSize = " + whichSize);
		System.out.println(mySquare);
		whichSize = 5;
		System.out.println("We change the primitive data and...");
		System.out.println("whichSize = " + whichSize);
		System.out.println(mySquare);
		System.out.println("The square does NOT change");
		
		System.out.println();
		System.out.println("Let's play with a user defined type...");
		Point whichOrigin;
		whichOrigin = mySquare.getOrigin();
		System.out.println("whichOrigin = " + whichOrigin);
		System.out.println(mySquare);
		whichOrigin.moveTo(0, 0);
		System.out.println("We change the user defined data and...");
		System.out.println("whichOrigin = " + whichOrigin);
		System.out.println(mySquare);
		System.out.println("The square DOES change");
	}

}

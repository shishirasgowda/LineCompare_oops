package linecompare;

public class LineCompare {
	
		
	private int x1,y1,x2,y2;
	/**
	 * Assigns point coordinates 
	 * @param x1 X coordinate of line1
	 * @param y1 Y coordinate of line1
	 * @param x2 X coordinate of line2
	 * @param y2 Y coordinate of line2
	 */
	LineCompare(int x1,int y1,int x2,int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	/**
	 * Displays welcome message on console
	 */
	private static void displayWelcome() {
		System.out.println("Welcome to Line Comparison Computation Program");
	}
	/**
	 * calculates distance between two points
	 * @return length
	 */
	private double calcLength() {
		double length;
		length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return length;
	}
	/**
	 * Checks if lines have same length or not
	 * @return true if lines have same length, otherwise false
	 */
	private static boolean checkEqual() {
		LineCompare line3 = new LineCompare(1,2,3,6);
		double length3=line3.calcLength();
		LineCompare line4 = new LineCompare(1,2,5,6);
		double length4=line4.calcLength();
		if(length3==length4)
			return true;
		else
			return false;
	}
	/**
	 * Compares length of two lines, Tells which one is longer
	 */
	private static void compareLines() {
		LineCompare line5 = new LineCompare(1,2,3,6);
		double length5=line5.calcLength();
		LineCompare line6 = new LineCompare(0,0,1,1);
		double length6=line6.calcLength();
		if(length5==length6)
		{
			System.out.println("Equal");
		}
		else if(length5>length6)
		{
			System.out.println("Line5 > Line6");
		}
		else
		{
			System.out.println("Line6 > Line5");
		}
			
	}

	public static void main(String[] args) {
		displayWelcome();
		LineCompare line1=new LineCompare(1,2,3,4);
		LineCompare line2=new LineCompare(8,4,1,1);
		line1.calcLength();
		line2.calcLength();
        checkEqual();
        compareLines();
	}

}
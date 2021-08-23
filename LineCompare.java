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

	public static void main(String[] args) {
		displayWelcome();
		LineCompare line1=new LineCompare(1,2,3,4);
		LineCompare line2=new LineCompare(8,4,1,1);
		line1.calcLength();
		line2.calcLength();
        
	}

}
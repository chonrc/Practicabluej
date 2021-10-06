public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void moveTo(int newX, int newY){
		this.x = newX;
		this.y = newY;
	}
	
	public String toString(){
		return "(" + this.x + "," + this.y + ")";
	}
	
}

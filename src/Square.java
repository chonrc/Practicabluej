public class Square {
	private int size;
	private Point origin;
	
	public Square(int size, Point origin){
		this.size = size;
		this.origin = origin;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public Point getOrigin(){
		return this.origin;
	}
	
	public String toString(){
		return "Square: Size = " + this.size +
				" Origin = " + this.origin;
	}
	
}

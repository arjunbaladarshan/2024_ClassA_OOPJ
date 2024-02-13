public class RectangleDemo{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.height=5;
		r1.width=5;
		r1.isFilled = true; 
		r1.print();

		Rectangle r2 = new Rectangle();
		r2.height=10;
		r2.width=7; 
		r2.isFilled = false;
		r2.print();
	}
}
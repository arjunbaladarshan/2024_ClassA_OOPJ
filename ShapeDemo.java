import java.util.Scanner;
class Rectangle{
	int height;
	int width;
	public Rectangle(){
		height = 5;
		width = 5;
	}

	public Rectangle(int height){
		this.width = 5;
		this.height = height;
	}

	public Rectangle(int height,int width){
		this.width = width;
		this.height = height;
	}

	public void printRect(){
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("===================================");
	}
}
public class ShapeDemo{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.printRect();

		Rectangle r2 = new Rectangle(10);
		r2.printRect();

		Rectangle r3 = new Rectangle(10,10);
		r3.printRect();
	}
}

public class DemoTest{
	static class Point2D{
		int x,y;
		public Point2D(int x, int y){
			this.x = x;
			this.y = y;
		}
		public double distance(Point2D temp){
			return Math.sqrt(Math.pow(this.x-temp.x,2)+Math.pow(this.y-temp.y,2));
		}
	}
	public static void main(String[] args) {
		DemoTest.Point2D p1 = new DemoTest.Point2D(0,0);
		DemoTest.Point2D p2 = new DemoTest.Point2D(10,0);

		double ans = p1.distance(p2);
		System.out.println(ans);
	}
}
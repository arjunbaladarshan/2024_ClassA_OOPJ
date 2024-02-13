class Box{
	int width;
	int breadth;
	int height;

	public Box(int w, int b, int h){
		width = w;
		breadth = b;
		height = h;
	}

	public void printVolume(){
		int ans = width * breadth * height;
		System.out.println("Ans = "+ans);
	}

}

public class Rectangle {
//	topLeft:Point
//	height:int
//	width:int
	Point topLeft;
	int height;
	int width;
//	getArea: It should return area of rectangle as an integer
//			getParameter: It should return parameter of rectangle as an integer
//			getBottomRight: It should return a Point to represent the bottom right of the Rectangle
	public int getArea(int height, int width) {
		return height*width;
	}
	public int getParameter(int h, int w) {
		return 2*(h+w);
	}
	public Point getBottomRight(int height, int width) {
		Point bottomRight = new Point();
		bottomRight.x = topLeft.x+width;
		bottomRight.y = topLeft.y-height;
		return bottomRight;
		
	}

}


public class Assignment4 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		
		int x1, y1, x2, y2;
		x1 = 0; y1 = 0; x2 = 10; y2 = 10;
		double c = dLength(x1,y1,x2,y2);
		System.out.println("(0,0) (10,10) 사이의 거리는 "+c);
		
		x1 = 10; y1 = 15; x2 = 25; y2 = 60;
		double d = dLength(x1,y1,x2,y2);
		System.out.println("(10,15) (25,60) 사이의 거리는 "+d);

	}
	static double dLength(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}

}

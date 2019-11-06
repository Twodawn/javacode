package lecture07;

public class Ex6_12 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		double x,y;
		
		x=10.0;
		y=20.0;
		double area = fn_area(x,y);
		
		System.out.println("면적 = "+area);
	}
	
	public static double fn_area(double x, double y)
	{
		double result;
		result = x*y;
		return result;
	}
}

package lecture07;

public class Ex6_6 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		double x,y;
		
		x=10.0;
		y=20.0;
		double add_value = fn_add(x,y);
		
		System.out.println("더하기 = "+add_value);
	}
	
	public static double fn_add(double x, double y)
	{
		double result;
		result = x+y;
		return result;
	}
}

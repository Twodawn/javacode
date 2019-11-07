
public class AAA {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		System.out.println("절차 프로그램");
		double x,y;
		x=10.0;
		y=20.0;
		double mul_value = x*y;	
		double tri_value = x*y/2;
		System.out.println("곱하기 = "+mul_value);
		System.out.println("사각형 면적 = "+mul_value);
		System.out.println("삼각형 면적 = "+tri_value+"\n");
		
		System.out.println("함수 프로그램");
		double mul_value2 = fn_mul(x,y);
		double tri_value2 = fn_tri(x,y);
		System.out.println("곱하기 = "+mul_value2);
		System.out.println("사각형 면적 = "+mul_value2);
		System.out.println("삼각형 면적 = "+tri_value2+"\n");
		
		System.out.println("객체 프로그램");
		Mult mul1 = new Mult();
		mul1.x=10.0;
		mul1.y=20.0;
		double mul_value3 = mul1.fn_mul2();
		double tri_value3 = mul1.fn_tri2();
		System.out.println("곱하기 = "+mul_value3);
		System.out.println("사각형 면적 = "+mul_value3);
		System.out.println("삼각형 면적 = "+tri_value3+"\n");
		
		System.out.println("자바빈 프로그램");
		Mult2 mul2 = new Mult2();
		mul2.setX(10.0); mul2.setY(20.0);
		double mul_value4 = mul2.fn_mul3();
		double tri_value4 = mul2.fn_tri3();
		System.out.println("곱하기 = "+mul_value4);	
		System.out.println("사각형 면적 = "+mul_value4);
		System.out.println("삼각형 면적 = "+tri_value4);
		
	}	
	public static double fn_mul(double x,double y) {
		double result;
		result = x*y;
		return result;
	}
	public static double fn_tri(double x,double y) {
		double result;
		result = x*y/2;
		return result;
	}
}
class Mult{
	double x,y;
	public double fn_mul2(){
		double result;
		result = this.x*this.y;
		return result;
	}
	public double fn_tri2() {
		double result;
		result = this.x*this.y/2;
		return result;
	}
}
class Mult2{
	private double x,y;	
	void setX(double x) {this.x=x;}	
	double getX() {return this.x;}	
	void setY(double y) {this.y=y;}	
	double getY() {return this.y;}	
	public double fn_mul3() {
		return this.x*this.y;
	}
	public double fn_tri3(){
		return this.x*this.y/2;
	}
}

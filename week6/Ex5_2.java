package week6;

public class Ex5_2 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		int a00=8; int a01=5; int a02=2; int a03=3; int a04=6;
		int a10=5; int a11=4; int a12=1; int a13=3; int a14=7;

		System.out.println("동일타입변수0 = "+a00+","+a01+","+a02+","+a03+","+a04);
		System.out.println("동일타입변수1 = "+a10+","+a11+","+a12+","+a13+","+a14);

		int [][] a = new int [2][5];
		a[0][0] = 8; a[0][1] = 5; a[0][2] = 2; a[0][3] = 3; a[0][4] = 6;
		a[1][0] = 5; a[1][1] = 4; a[1][2] = 1; a[1][3] = 3; a[1][4] = 7;

		System.out.println("동일타입변수0 = "+a00+","+a01+","+a02+","+a03+","+a04);
		System.out.println("동일타입변수1 = "+a10+","+a11+","+a12+","+a13+","+a14);


	}

}

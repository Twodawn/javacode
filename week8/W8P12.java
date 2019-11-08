package lecture08;

public class Ex8_22 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		smartPhone phone1 = new smartPhone();
		phone1.display();
	}
}
abstract class Device{
	String name;
	abstract void display();
}
class smartPhone extends Device{
	void display() {
		System.out.println("스마트폰 디스플레이");
	}
}

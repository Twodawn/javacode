package lecture08;

public class Ex8_16 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		WebCount1 c1 = new WebCount1();
		WebCount1 c2 = new WebCount1();
	}
}
class WebCount1{
	int count = 0;
	WebCount1(){
		this.count++;
		System.out.println(this.count);
	}
}

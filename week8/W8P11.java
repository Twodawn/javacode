package lecture08;

public class Ex8_19 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		WebCount3 c1 = new WebCount3();
		WebCount3 c2 = new WebCount3();
		System.out.println(WebCount3.getCount());
	}
}
class WebCount3{
	static int count = 0;
	WebCount3(){
		WebCount3.count++;
		System.out.println(WebCount3.count);
	}
	public static int getCount() {
		return WebCount3.count;
	}
}

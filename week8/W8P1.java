package lecture08;

public class Ex8_9 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		Cat1 aCat = new Cat1();
		aCat.setName("야옹이");
		System.out.println(aCat.getName()+"는 "+aCat.identify());
	}
}

class Animal1{
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String identify() {
		return "동물";
	}
}
class Cat1 extends Animal1{}


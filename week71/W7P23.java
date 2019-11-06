package lecture07;

public class Ex7_12 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		Animal anim = new Animal();
		anim.setName("야옹이");
		System.out.println(anim.getName()+"는 "+anim.identify());
	}
}
class Animal{
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

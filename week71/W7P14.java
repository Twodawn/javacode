package lecture07;
class NameX{
	String name;
	void setName(String nm) {name = nm;}
	String getName() {return name;}
	String getSName() {return "이름 = "+getName();}
}
public class Ex7_0 {
	public static void main(String [] args) {
		System.out.println("20161450 이새벽");
		NameX kdhong = new NameX();
		kdhong.setName("홍길동");
		System.out.println(kdhong.getSName());
	}
}

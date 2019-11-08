package lecture08;

public class Ex8_12 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		Cat4 aCat = new Cat4();
		aCat.setName("야옹이");
		
		System.out.println(aCat.getName()+"의 장점 = "+aCat.crawling());
		System.out.println(aCat.getName()+"는 "+aCat.identify());
		System.out.println(aCat.getName()+"는 원래 "+aCat.identifyOrigin());
	}
}

class Animal4{
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

class Cat4 extends Animal4{
	public String crawling() {
		return "나무오르기";
	}	
	@Override
	public String identify() {
		return "고양이";
	}
	public String identifyOrigin() {
		String str = super.identify();
		return str;
	}
}


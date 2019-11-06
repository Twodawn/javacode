package lecture07;

public class Ex7_1 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		NavySoldier kdhong;
		kdhong = new NavySoldier("홍길동","1등병");
		
		System.out.println(kdhong.name);
		System.out.println(kdhong.rank);
		kdhong.setHeight("170");
		System.out.println(kdhong.getHeight());
		
		kdhong.swimming();
		kdhong.firing();
	}
}

class NavySoldier {
	
	String name,rank,height,weight,service;
	
	NavySoldier(String name, String rank)
	{
		this.name = name;
		this.rank = rank;
	}
	
	void swimming() {
		System.out.println(this.name+" 잠수하기");
	}
	void firing() {
		System.out.println(this.name+" 대포발사");
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}
}
	

package lecture08;

public class Ex8_13 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		Pine pine = new Pine("3.5", "소나무");
		System.out.println("높이(m) : "+pine.getHeight());
		System.out.println("품종 : "+pine.getSpecies());
	}
}

class Tree{
	String height;
	public Tree(String height) {
		this.height = height;
	}
	public void setHeight(String height) {
		this.height= height;
	}
	public String getHeight() {return this.height;}
}

class Pine extends Tree{
	String species;
	public Pine(String height,String species) {
		super(height);
		this.species = species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getSpecies() {
		return this.species;
	}
}


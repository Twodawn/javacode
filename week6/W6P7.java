package week6;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("20161450 ÀÌ»õº®");
		
		String gender = "female";
		fnGender(gender);
		gender = "male";
		fnGender(gender);
	}
	static void fnGender(String gender) {
		if(gender=="female") {
			System.out.println("¿©ÀÚ");
		}else if(gender=="male") {
			System.out.println("³²ÀÚ");
		}
	}

}
	

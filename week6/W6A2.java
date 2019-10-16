
public class Assignment3 {

	public static void main(String[] args) {
		System.out.println("20161450 이새벽");
		
		float tempC = temp_convert(70.0f);
		System.out.println("화씨 70도는 섭씨 "+tempC+"도");

	}
	static float temp_convert(float farenheit) {
		float celsius = (farenheit -32)*(5.0f/9.0f);
		return celsius;
	}

}

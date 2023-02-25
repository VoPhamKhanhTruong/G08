package OOP2;

public class Main {

	public static void main(String[] args) {
		Time time = new Time(24, 60, 60);
		Time nextSecondTime = time.nextSecond();
		System.out.println(time.toString());
		
	}
}


public class DriverApp {

	public static void main(String[] args) {
		MinimumTime mt=new MinimumTime();
		mt.accept();
		int seconds=mt.calculateMinTime();
		System.out.println("Minimum Time taken "+seconds);

	}

}


public class ThreadTest01 {
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			System.out.println("겁나 어려워");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}

	}

}

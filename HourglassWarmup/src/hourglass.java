
public class hourglass {
		public static void main(String[] args) {
			base();
			tophalf();
			//middle();
			//bottomhalf();
			base();
		}
	public static void base() {
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
	}
	public static void space() {
		System.out.print(" ");
	}
	public static void side() {
		System.out.print("\\");
	}
	public static void middle() {
		System.out.println("||");
	}
	public static void side2() {
		System.out.print("/");
	}
	public static void inside() {
		System.out.print(";");
	}
	public static void ln() {
		System.out.println();
	}
	public static void topHalf(){
		for (int space = 1;space<=4;space++) {
			space();
		} side();
		for (int inside = 8; inside>=2; inside-=2) {
			inside();
		} side2();
	}
	
}
	
	
		
		
	
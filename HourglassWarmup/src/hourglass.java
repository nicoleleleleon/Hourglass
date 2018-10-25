
public class hourglass {
		public static void main(String[] args) {
			base();
			topHalf();
			middle();
			//bottomhalf();
			base();
		}

	public static void base() {
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
	}

	public static void middle() {
		System.out.println("     ||");
	}

	public static void topHalf(){
		for(int line = 0; line < 4; line++) {
			System.out.print(" ");
				System.out.print("\\");
				for(int colon = 8; colon>=2; colon-=2) {
					System.out.print(":");
				}
						System.out.println("/");
				
		}
	}
}

	
	
		
		
	

public class hourglass {
		public static void main(String[] args) {
			base();
			topHalf();
			middle();
			botHalf();
			base();
		}

	public static void base() {
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
	}

	public static void middle() {
		System.out.println("     ||");
	}

	public static void topHalf(){
		
		for(int line = 1; line < 5; line++) {
				for(int space = 0; space<line; space++) {
						System.out.print(" ");
				}
				System.out.print("\\");
				
				for(int colons = 8; colons>0+(line-1)*2; colons--) {
					System.out.print(":");

				}
						System.out.println("/");
				
		}
	}
	public static void botHalf(){
		
		for(int line = 5; line > 1; line--) {
				for(int space = line; space>0; space--) {
						System.out.print(" ");
				}
				System.out.print("/");
				int count = 0;
				for(int colons = 0; colons < 2 + 2*count; colons++) {
					System.out.print(":");
//why doesn't it work?? errorcount++;	
				}	
				
						System.out.println("\\");
						
}
	}
}

	
	
		
		
	
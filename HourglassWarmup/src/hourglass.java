
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
				for(int space = 0; space<line; space++) {//spaces
						System.out.print(" ");
				}
				System.out.print("\\");
				
				for(int colons = 8; colons>0+(line-1)*2; colons--) {//worked out formula for number of colons and line#
					System.out.print(":");

				}
						System.out.println("/"); //closes it off
				
		}
	}
	public static void botHalf(){
		int count = 0;
		for(int line = 5; line > 1; line--) {
				for(int space = line; space>1; space--) {//makes spaces
						System.out.print(" ");
				}
				System.out.print("/");
				
				for(int colons = 0; colons < 2 + 2*count; colons++) {
					System.out.print(":");
				}				
						System.out.println("\\"); //closes it off
						count++; //each time, 2 more colons
}
	}
}

	
	
		//10 printlns... hmm.. it works?!
		
	
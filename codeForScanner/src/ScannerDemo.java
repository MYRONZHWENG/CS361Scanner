
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// This needs to be changed !
	private static String file1 = "/Users/myron_zun_hao_weng/Desktop/Pace/Classes/2024 - 2025/Fall 2024/CS 361/HW5(Scanner)/GitHub/CS361Scanner/testPrograms/program6.txt"; //string form of directory to file
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);

		Token tk = new Token();
		while (!ts.isEndofFile()) {
			// TO BE COMPLETED

			tk = ts.nextToken();
			if (tk.getValue() != "") System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}

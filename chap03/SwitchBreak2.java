// switch文とbreak文の働きの理解を深めるためのプログラム（Java 14から）

import java.util.Scanner;

class SwitchBreak2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int n = stdIn.nextInt();

		switch (n) {
		 case 0 : System.out.print("A");
							System.out.print("B");
							break;
		 case 2 : System.out.print("C");
		 case 5 : System.out.print("D");
							break;
		 case 6, 7:
							System.out.print("E");
							break;
		 default: System.out.print("F");
							break;
		}
		System.out.println();
	}
}

package problem04;

import java.util.Scanner;

public class Main {
	
	static char[] bridge = new char[20];
	static int restart = 0; 
	static int count = 0; //dice
	
	public static void main(String[] args) {
		makeBridge();
		printBridge();
		
		int userposition = 0;
		
		System.out.println("press enter key!");
		
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		while(userposition != bridge.length) {
			int d = dice(userposition);
			if(n.isEmpty()) {
				if (bridge[userposition + d - 1]=='#') {
					//restart game
					makeBridge();
					System.out.println("make new bridge");
					printBridge();
					restart ++;
					userposition = 0;

					System.out.println("press enter key!");
					n = input.nextLine();
				} else {
					userposition += d;
					count++;
					System.out.println("press enter key!");
					n = input.nextLine();
				}
			}
		}
		
		System.out.println("You win!");

		
	}

	
	public static void makeBridge() {
		int water = 0; 
		int stone = 0;
		for (int i = 0; i<bridge.length; i++) {
			int r = (int)(Math.random()*2)+1;
			//1 : water(#) 2 : stone(O)
			if (r ==1 && water != 10) {
				bridge[i] = '#';
				water++;
			} else if (r == 2 && stone != 10) {
				bridge[i] = 'O';
				stone++;
			} else {
				i--;
			}
		}
	}
	
	public static void printBridge() {
		for (char c : bridge) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static int dice(int position) {
		int result = (int)(Math.random()*4)+1;
		System.out.println("result of the dice : "+ result);
		position += result;
		printBridge();
		for (int i = 0; i<position-1; i++) {
			System.out.print(" ");
		}
		System.out.println("^");
		return result;
	}
}
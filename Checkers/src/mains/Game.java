package mains;

import java.util.Scanner;


public class Game {

	public static void main(String[] args){
		
		
		boolean turnCheck = false;
		boolean GameCheck= true;
		
		
		CheckerBoard test = new CheckerBoard();
		
		test.setBoard();
		
		System.out.println(test.getPiece(1,1));
		
		
		while(GameCheck==true){
			System.out.println(test);
			Scanner in = new Scanner(System.in);
			System.out.println("(Please write in the for \"x1 y1 x2 y2\" where the first set are the coords"
					+ " \n of the piece you are moving and the second set is where they are going");
			if(turnCheck==false){
				System.out.println("Red to Play, What is your move? :: ");
				turnCheck=true;
			}else{
				System.out.println("Black to Play, What is your move? :: ");
				turnCheck=false;
			}
			
			
			Scanner movep = new Scanner( in.nextLine());
			test.move(movep.nextInt()-1,8-movep.nextInt(), movep.nextInt()-1,8-movep.nextInt());
						
			
			
		}
		
		
	}
	
}

package mains;

import java.util.Scanner;


public class Game {

	public static void main(String[] args){
		
		
		boolean turnCheck = false;
		boolean GameCheck= true;
		
		
		CheckerBoard test = new CheckerBoard();
		
		test.setBoard();
		
		System.out.println(test);
		
		
		while(GameCheck==true){
			
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
			int tX1 = movep.nextInt()-1;
			int tY1 = 8-movep.nextInt();
			int tX2 = movep.nextInt()-1;
			int tY2 = 8-movep.nextInt();
			
			
			test.move(tX1, tY1, tX2, tY2);
			
			
			if(tY2- tY1==-2&& tX2-tX1==2){
				System.out.println((tX1+1)+""+(tY1-1));
				test.setPiece(tX1+1, tY1-1, null); //new Checkers(tX1+1, tY1-1,"p","black")
				System.out.println(test.getPiece(tX1+1, tY1-1));							// The Y and X are backwards
				System.out.println("Should be null");
			}
			
			
			/*
			if(tY2- tY1==2&& tX2-tX1==2){
				test.setPiece(tX1+1, 7-tY1, null);
			}
			
			if(tY2- tY1==2&& tX2-tX1==2){
				test.setPiece(tX1, 9-tY1, null);
			}
			
			if(tY2- tY1==2&& tX2-tX1==2){
				test.setPiece(tX1, 9-tY1, null);
			}*/
			
			
			
			
						
			
			System.out.println(test);	
		}
		
		
	}
	
}

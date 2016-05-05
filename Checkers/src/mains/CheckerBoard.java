package mains;

public class CheckerBoard extends Board{
	
	
	public CheckerBoard(){
		super(8);
		
		for(int r = 0; r< 8; r++){
			
			for(int c = 0; c<8;c++){
				setPiece(r,c,new Checkers(r,c));
				
			}
		}
		
	}
	public void setBoard(){
		int checkerr = 0;
		
		for(int r = 0; r< getSize(); r++){
			checkerr++;
			for(int c = 0; c<getSize();c++){
				
				if((r+c)%2==1 && r!=3 && r!=4){
					setPiece(r,c, new Checkers(r,c,"P","R"));
				} 
				
				
				
				
			}
		}
	}
	
	
	public String toString(){
		return super.toString();
	}
}

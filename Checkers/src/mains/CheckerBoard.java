package mains;

public class CheckerBoard extends Board{
	
	
	public CheckerBoard(){
		super(8);
		
//		for(int r = 0; r< 8; r++){
//			
//			for(int c = 0; c<8;c++){
//				setPiece(r,c,new Checkers(r,c));
//				
//			}
//		}
		
	}
	public void setBoard(){
		int checkerr = 0;
		
		for(int r = 0; r< getSize(); r++){
			checkerr++;
			for(int c = 0; c<getSize();c++){
				
				if((r+c)%2==1 && r<3){
					setPiece(r,c, new Checkers(r,c,"P","black", false));
				} 
				else if((r+c)%2==1 && r>4){
					setPiece(r,c, new Checkers(r,c,"P","red", false));
				} else{
					setPiece(r,c, null);
				}
				
				
				
			}
		}
	}
	
	public void move(int c1, int r1, int c2, int r2){
		
		//Checkers[][] one = new Checkers[getSize()][getSize()];
		Checkers moved = (Checkers)getPiece(r1,c1);
		//Checkers tru = new Checkers(getPiece(r1,c1).getX(), getPiece(r1,c1).getY(), getPiece(r1,c1).getName(), getPiece(r1,c1).kingState(), )
		setPiece(r1,c1, null);
		setPiece(r2,c2, moved);
		
		if(r2 == 0 && moved.getColor()== "red"){
			moved.kingState(true);
		}
		if(r2 == 7 && moved.getColor()== "black"){
			moved.kingState(true);
		}

		
	}
	
	public String toString(){
		return super.toString();
	}
}
